package com.zmdyz.demo_2;

public class HomeWorks3 {
    public static void main(String[] args) {
        System.out.println(su(181,200));
    }
    public static int su(int start,int end){
        int count=0;
        for (int i=start;i<=end;i++){
            boolean flag = true;
            for (int j=2;j<i;j++){
                if (i % j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数个数：");
        return count;
    }
}
