package com.zmdyz.demo_2;

public class HomeWorks1 {
    public static void main(String[] args) {
        System.out.println(plane(500,6,"经济舱"));

    }
    public static double plane(double price,int month,String type){
        // 1.判断当前月份是淡季还是旺季
        //旺季
        if (month>=5 && month<=10){
            //判断仓位类型
            switch (type){
                case"头等舱":
                    price *=0.9;//price=price*0.9
                    break;
            }

        }else{
            //淡季
            //判断仓位类型
            switch (type){
                case"头等舱":
                    price *=0.7;//price=price*0.9
                    break;
                case"经济舱" :
                    price *=0.65;//price=price*0.9
                    break;
            }
        }
        return price;
    }
}
