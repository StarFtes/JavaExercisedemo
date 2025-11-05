/**
 * 我没有男友，but我有女朋友
 */
package com.zmdyz.demo_2;

class behavior{
    private static void be1(){
        System.out.println("爱逛街，但是她在郑州，我没有办法实时去陪她逛街：");
        System.out.println("she say:你这周来不来找我，咱俩一起去逛");
    }
    private static void be2(){
        System.out.println("睡觉前都会和我互道晚安：");
        System.out.println("she say:饱饱，晚安");
    }
    public static void Unfinished(){

        System.out.println("=======END========");
    }

    public static void main() {
        System.out.println("关于她的部分事情：");
        be1();
        be2();
        Unfinished();
    }
}

public class homework_demo1 {
    public static void main(String[] args) {
        behavior be=new behavior();
        be.main();
    }

}