package com.ele.base.Atomic;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

//线程安全的并发
public class CountExample2 {
    //请求总数
    public static int clientTotal = 5000;
    //同时并发执行的线程数
    public static int threadTotal = 200;
    //全局变量
    public static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //信号灯，同时允许执行的线程数
        final Semaphore semaphore = new Semaphore(threadTotal);
        //计数器，
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(()->{
                try {
                    //获取信号灯,当并发达到一定数量后,该方法会阻塞而不能向下执行
                    semaphore.acquire();
                    add();
                    //释放信号灯
                    semaphore.release();
                }catch (InterruptedException e){
                    System.out.println("exception");
                    e.printStackTrace();
                }
                //闭锁,每执行一次add()操作，请求数就减一
                countDownLatch.countDown();
            });
        }

        //等待上面的线程都执行完毕，countDown的值减为0，然后才向下执行主线程
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印count的值
        System.out.println("count:"+count.get());
        //关闭线程池
        executorService.shutdown();
    }
    private static void add(){
        //count++;
        count.incrementAndGet();
    }
}