package com.zmdyz.demo_6;
import java.util.Objects;
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    public Student() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
