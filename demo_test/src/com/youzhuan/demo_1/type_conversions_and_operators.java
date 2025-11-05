/**
 *张博超
 * 2203090139
 **/
package com.youzhuan.demo_1;

//自动类型转换与强制类型转换
//运算符
public class type_conversions_and_operators {
    public static void main(String[] args) {
        //自动转换数据类型
        byte a=3;
        double b=7.0;
        System.out.println(a+b);//输出10.0，double类型
        //强制转换数据类型
        double c=a+b;
        int d= (int) c;
        System.out.println(d);//输出10，int类型
        double e=1.0;
        int f= (int) e;
        System.out.println(f);//输出1，int类型

        //运算符
        //逻辑运算符
        double size=6.8;
        int strage=16;
        //运算符&
        boolean rs=size>=6.95&strage>=8;
        System.out.println(rs);
        //运算符|
        boolean rs1=size>=6.95|strage>=8;
        System.out.println(rs1);
        //运算符！
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2>1));
        //运算符^
        System.out.println(true^true);//F
        System.out.println(false^false);
        System.out.println(false^true);
        System.out.println(true^false);
        //运算符&&
        int i=10;
        int j=20;
        System.out.println(i>100&++j>99);
        System.out.println(j);
        //6.||左边为true 右边不执行
        int m=10;
        int n=30;
        System.out.println(m>3||++n>40);

        System.out.println(n);



    }
}
