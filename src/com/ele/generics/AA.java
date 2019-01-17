package com.ele.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AA
 * @Description TODO
 * @Author zzw
 * @Date
 */
public class AA {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("aa");
        l1.add("bb");
        l1.add("cc");
        printList(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(22);
        l2.add(33);
        printList(l2);

    }

    public static void addTest(List<?> list) {
        Object o = new Object();
        // list.add(o); // 编译报错
        // list.add(1); // 编译报错
        // list.add("ABC"); // 编译报错
        list.add(null);
    }

    public static void getTest(List<?> list) {
        // String s = list.get(0); // 编译报错
        // Integer i = list.get(1); // 编译报错
        Object o = list.get(2);
    }

}
