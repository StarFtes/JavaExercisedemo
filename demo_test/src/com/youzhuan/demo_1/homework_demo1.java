package com.youzhuan.demo_1;

public class homework_demo1 {
    public static void main(String[] args) {
        //数据反转
        //1.准备数组
        int[] arr = {10, 20, 30, 40, 50};
        //2.定义循环，2个变量，一个在前，一个在后
        for (int i = 0, j = arr.length - 1; i < j; i++) {
            //arr[i] arr[j]
            //交换
            //定义一个临时变量记住后一个位置的值
            int temp = arr[j];
            //把前一个位置处的值赋值给后一个位置
            arr[j] = arr[i];
            //把临时变量的值给第一个位置
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
