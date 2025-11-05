package com.youzhuan.demo_1;

public class loop_demo2 {
    public static void main(String[] args) {
        System.out.println("九九乘法表如下：");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + "*" + j + "=" + (i*j) + "	");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}

