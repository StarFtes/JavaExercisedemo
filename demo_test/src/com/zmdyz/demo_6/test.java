package com.zmdyz.demo_6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}
