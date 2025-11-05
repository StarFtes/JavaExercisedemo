package com.zmdyz.demo_2;

public class homeworks2024_demo1 {
    public static void main(String[] args) {
        // 定义一个匿名内部类，并重写swim方法
        Swimming a = new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗正在狗刨.....");
            }
        };
        // 定义一个匿名内部类，并重写swim方法
        Swimming b = new Swimming() {
            @Override
            public void swim() {
                System.out.println("猫正在后空翻.....");
            }
        };
        // 执行go方法
        go(a);
        go(b);
    }
    // 定义一个go方法
    public static void go(Swimming s){
        System.out.println("比赛开始");
        s.swim();
    }
    // 定义一个抽象类
    interface Swimming {
        void swim();
    }
}
