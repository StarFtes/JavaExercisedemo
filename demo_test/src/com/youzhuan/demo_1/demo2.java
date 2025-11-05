package com.youzhuan.demo_1;
import com.sun.deploy.security.SelectableSecurityManager;
import java.util.Random;
import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        //1.随机产生1-100数字，作为炸弹数字
        Random r = new Random();
        int luckNumber = r.nextInt( 100)+1;

        //2.定义一个死循环，让用户不断地猜测数字
        Scanner sc =new Scanner(System.in);
        while (true){
            //提示用户猜数字
            System.out.println("请您输入猜测的数字:");
            int guessNbmber= sc.nextInt();
            //3.判断用户猜测的数字与幸运数字大小情况
            if (guessNbmber >luckNumber){
                System.out.println("您猜测的数字过大~~");
            }else if (guessNbmber <luckNumber){
                System.out.println("您猜测的数字过小~~");
            }else {
                System.out.println("恭喜您，喜得炸弹~~");
                break;
            }
        }
    }
}