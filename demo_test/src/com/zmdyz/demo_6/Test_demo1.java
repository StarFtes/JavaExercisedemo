package com.zmdyz.demo_6;

public class Test_demo1 {
    public static void main(String[] args) {
        System.out.println(anInt(100));
    }
    public static int anInt(int n){
        if (n == 1){
            return 1;
        }
        else {
            return anInt(n - 1 );
        }
    }
}
