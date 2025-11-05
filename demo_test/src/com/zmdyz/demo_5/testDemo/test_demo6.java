// 这是一个关于抛出异常的demo
package com.zmdyz.demo_5.testDemo;


public class test_demo6 {
    public static void main(String[] args) {
        try {
            saveAge(100);
            System.out.println("执行成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("有bug");
        }
    }
    public static void saveAge(int age){
        if (age > 0 && age <= 150){
            System.out.println("年龄被保存"+ age);
        }else {
            throw new ArithmeticException("/age is illegal,your age is"+ age);
        }
    }
}
