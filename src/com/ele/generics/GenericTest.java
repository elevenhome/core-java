package com.ele.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AA
 * @Description TODO
 * @Author zzw
 * @Date
 */
public class GenericTest {

    public static void main(String[] args) {
        Box<String> name = new Box("corn");
        System.out.println("name:" + name.getData());

        Pen<Integer> pen = new Pen(new Integer(2));
        System.out.println("age="+pen.getData());

        List<String> ls = new ArrayList(); // 1

//        List<Object> lo = ls; // 2


    }
}

class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}


class Pen<E>{

    private E data;

    public Pen(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}


