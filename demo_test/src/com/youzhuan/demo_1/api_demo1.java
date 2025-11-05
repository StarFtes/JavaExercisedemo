package com.youzhuan.demo_1;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
public class api_demo1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的年龄(区间0-120)");
        int age=sc.nextInt();

        for (;age>0&age<=120;) {
                if (age < 18) {
                    System.out.println("您的年龄不符合要求");
                    break;
                }
                else {
                    System.out.println("条件符合欢迎您登入");
                    System.out.println("请输入您的姓名");
                    String text = sc.next();
                    System.out.println(text + "欢迎您登入系统");
                    break;
                }
        }
    }
}