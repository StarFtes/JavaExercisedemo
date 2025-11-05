package com.zmdyz.demo_5.testDemo;

import java.util.StringJoiner;

public class test2 {
    public static void main(String[] args) {
        String string = getArr(new int[]{11,22,33,44});
        System.out.println(string);
    }
    public static String getArr(int[] arr){
        if (arr == null){
            return null;
        }
        StringJoiner stringJoiner = new StringJoiner(",","【","】");
        for (int i=0;i<arr.length;i++){
            stringJoiner.add(arr[i] + "");
        }
        return stringJoiner.toString();

    }
}
