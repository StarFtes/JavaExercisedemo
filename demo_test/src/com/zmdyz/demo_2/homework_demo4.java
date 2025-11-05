package com.zmdyz.demo_2;
import java.util.Arrays;
public class homework_demo4 {

    public static class Main {
        public static void main(String[] args) {
            int[] a = new int[5];
            int[] b = new int[5];
            Arrays.fill(a, 2);
            Arrays.fill(b, 1, 2, 50);
            //判断数组a，b是否相等并返回相应语句
            if(Arrays.equals(a, b)) {
                System.out.println("两个数组相等 ");
            } else {
                System.out.println("两个数组不相等");
            }
        }
    }
//运行结果如下：
//两个数组不相等

}
