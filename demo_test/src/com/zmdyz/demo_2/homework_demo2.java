package com.zmdyz.demo_2;

import java.util.Scanner;

class Seat{
      public static void Case(){
          String a="1号厅《小丑回魂》";
          String b="2号厅《流浪地球3》";
          String c="3号厅《不知道什么电影》";

          System.out.println(a+" "+b+" "+c+" ");
          System.out.println("请选择一个场次(填数字即可)");
          Scanner sc=new Scanner(System.in);
          int sum=sc.nextInt();



            switch (sum) {
                case 1:
                    System.out.println("已成功选择1号厅《小丑回魂》");
                    break;
                case 2:
                    System.out.println("已成功选择2号厅《流浪地球3》");
                    break;
                case 3:
                    System.out.println("已成功选择3号厅《不知道什么电影》");
                    break;
                default:
                    System.out.println("您输入的场次不存在请重新输入");
            }
      }

}
public class homework_demo2 {
    public static void main(String[] args) {
        Seat s=new Seat();
        s.Case();

    }
}
