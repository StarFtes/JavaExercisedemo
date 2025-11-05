package com.zmdyz.demo_5.testDemo;
// 这是关于StringBuilder的相关操作
public class test {
    public static void main(String[] args) {
// 创建一个对象，并添加初始字符串
        StringBuilder stringBuilder = new StringBuilder("ABCD");
// 添加字符串，并打印出来
        stringBuilder.append("EF");
        stringBuilder.append("GH");
        stringBuilder.append(10);
        stringBuilder.append(true);
        System.out.println(stringBuilder);
// 采用链式编程添加字符窜
        stringBuilder.append("111").append("222").append("333").append("999");
        System.out.println(stringBuilder);
// 反转字符串操作
        stringBuilder.reverse();
        System.out.println(stringBuilder);
// 打印字符串长度
        System.out.println(stringBuilder.length());
// 以变量的形式打印翻转后的字符串
        String s =stringBuilder.toString();
        System.out.println(s);


    }
}
