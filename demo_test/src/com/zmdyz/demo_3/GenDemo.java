package com.zmdyz.demo_3;

public class GenDemo {
    public static void main(String[] args) {
        // 创建一个gen_homework<>()实例
        gen_homework<String> gen = new gen_homework<>();
        // 使用gen函数add添加内容
        gen.add("a");
        gen.add("b");
        gen.add("c");
        // 使用函数get，并赋值给变量
        String s1 = gen.get(0);
        String s2 = gen.get(1);
        String s3 = gen.get(3);
        // 打印这些变量
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
