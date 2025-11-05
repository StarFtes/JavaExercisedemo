package com.zmdyz.demo_2;

public class homework_demo3 {
    public static void main(String[] args) {
        int[] a=null;
        int[] b=null;
        System.out.println(sum(a,b));

        int[] a1=null;
        int[] b1={11,22,33};
        System.out.println(sum(a1,b1));

        int[] a2={66,77,88,99};
        int[] b2={11,22,33};
        System.out.println(sum(a2,b2));

        int[] a3={66,77,88,99};
        int[] b3={66,77,87,99};
        System.out.println(sum(a3,b3));

        int[] a4={66,77,88,99};
        int[] b4={66,77,88,99};
        System.out.println(sum(a4,b4));

    }
    public static boolean sum(int[] arr1,int[] arr2){
        if (arr1==null && arr2==null){
            return true;
        }
        if (arr1 == null || arr2==null){
            return false;
        }
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
