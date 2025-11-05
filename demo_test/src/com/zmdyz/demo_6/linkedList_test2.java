package com.zmdyz.demo_6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class linkedList_test2 {
    public static void main(String[] args) {
        System.out.println("========hashSET"); // 无序，不重复,无索引
        Set<Integer> set =new HashSet<>();
        set.add(1);
        set.add(777);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(666);
        System.out.println(set);

        System.out.println("======LinkedSet");// 升序，不重复，无索引
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(222);
        set1.add(1);
        set1.add(777);
        set1.add(2);
        set1.add(4);
        set1.add(3);
        set1.add(666);
        System.out.println(set1);

        System.out.println("========SET");//排序，不重复，无索引
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(111);
        set2.add(22);
        set2.add(333);
        set2.add(444);
        set2.add(555);
        set2.add(666);
        System.out.println(set2);
    }
}
