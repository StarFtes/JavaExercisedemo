package com.zmdyz.demo_5.testDemo;

import java.util.ArrayList;

public class testDemo {
    public static void main(String[] args) {

        Integer integer0 = new Integer(55);
        System.out.println(integer0);
        Integer integer1 = new Integer(66);
        System.out.println(integer1);

        Integer C = 10;
        int D = C;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        int B = arrayList.get(0);

        System.out.println("============================");
        Integer integer = 123;
        String a = Integer.toString(integer);
        System.out.println(a + 1);

        String a2 = integer.toString();
        System.out.println(a2 + 3);
    }
}
