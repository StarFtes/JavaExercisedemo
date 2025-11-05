package com.youzhuan.demo_1;

public class homework_demo2 {
    public static void main(String[] args) {
        int c=num(20,30);

        System.out.println(c);
        int a = sc(100);
        System.out.println(a);
    }

    public static int num(int a,int b){
        int c=a+b;
        return c;
    }
    public static int sc(int n){
        int sc=0;
        for (int i=0;i<=n;i++){
            sc+=i;
        }
        return sc;
    }
}
