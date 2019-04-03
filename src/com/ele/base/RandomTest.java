package com.ele.base;

import java.util.Random;

/**
 * @ClassName 随机数
 * @Description TODO
 * @Author zzw
 * @Date 2019年4月3日19:15:55
 */
public class RandomTest {

    public static void main(String[] args) {
        RandomTest test = new RandomTest();
//        test.demo0();
        test.demo1();
    }

//    1、不带参数的nextInt()会生成所有有效的整数（包含正数，负数，0）
//    2、带参的nextInt(int x)则会生成一个范围在0~x（不包含X）内的任意正整数
    public void demo0(){
        //打印 30到50之间的随机数
        int min = 30;
        int max = 50;
        for(int i=0;i<10;i++){
            System.out.println(new Random().nextInt(max-min)+min);
        }
    }


    public void demo1(){
        for(int i=0;i<10;i++){
            int rannum = (int) (new Random().nextDouble() * (999 - 100 + 1)) + 100;
            System.out.println(rannum);
        }

    }
}
