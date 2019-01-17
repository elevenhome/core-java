package com.ele.date;

import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description TODO
 * @Author zzw
 * @Date 2019年1月14日09:34:52
 */
public class DateUtils {


    /**
     * @Description 获取系统时间单位毫秒
     * @Author zzw
     * @Date 2019年1月14日09:34:52
     */
    public static Long getSystemTime(){
        return System.currentTimeMillis();
    }

    public static void demo1() {
        //获取当前时间毫秒值
//        long time = System.currentTimeMillis();
        long time = 1547285667839L;
        System.out.println(time);//1489330902308 //用Dated对象获取当前时间
        Date date = new Date();
        System.out.println(date);//Sun Mar 12 23:02:36 CST 2017 //将指定时间(毫秒值)传给Date构造器，自动转换为日期，后面记得加上L
        Date date2 = new Date(time);
        System.out.println(date2);
    }


    public static void main(String[] args){
        demo1();
    }
}
