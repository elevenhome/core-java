package com.ele.base.Atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <see></> https://blog.csdn.net/yaqingwa/article/details/17737771
 * @author zzw
 * @since 2019年4月28日13:54:49
 */
public class AtomicLongTest {

//    private static long counter = 0;
//    public static long addOne(){
//        return ++counter;
//    }

    private static AtomicLong counter = new AtomicLong(0);
    public static long addOne() {
        return counter.incrementAndGet();
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                        long num = addOne();
                        String threadName = Thread.currentThread().getName();
                        long threadId = Thread.currentThread().getId();
                        Thread.sleep(100);
                        System.out.println("threadName="+threadName+"   threadId="+threadId+"   num="+num);
                        if(num == 100){
                            System.out.println("counter = 100");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
    }
}
