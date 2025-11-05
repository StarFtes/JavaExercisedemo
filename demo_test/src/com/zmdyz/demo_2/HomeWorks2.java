package com.zmdyz.demo_2;

public class HomeWorks2 {
    public static void main(String[] args) {
        System.out.println(Secret(1983));
    }
    public static String Secret(int num){
        int[] numbers=split(num);

        for (int i=0;i<numbers.length;i++){
            numbers[i]=(numbers[i]+5) %10;

        }
        reverse(numbers);
        String data="";
        for (int i=0;i<numbers.length;i++){
            data += numbers[i];
        }
        return data;
    }
    public static void reverse(int[] numbers){
        for (int i=0,j=numbers.length-1;i<1;i++,i--){
            int temp=numbers[j];
            numbers[j]=numbers[i];
            numbers[i]=temp;
        }
    }
    public static int[] split(int num){
        int[] numbers=new int[4];
        numbers[0]=num / 1000;
        numbers[1]=num / 100 % 10;
        numbers[2]=num / 10 %10;
        numbers[3]=num % 10;

        return numbers;
    }
}
