package com.zmdyz.demo_2;

import java.util.Random;
import java.util.Scanner;

public class HomeWorks4 {
    public static void main(String[] args) {
        int[] moneys = {9, 99, 999, 9999, 99999};
        start(moneys);
    }

    public static void start(int[] moneys) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
//            抽奖次数

            System.out.println("开始抽奖:");
            sc.next();
//            抽奖
            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
//            随机生成红包
                if (money != 0) {
                    System.out.println("抽中红包：" + money);
                    moneys[index] = 0;
                    //                抽中后红包为0
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }

}