package com.zmdyz.demo_5.testDemo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Arrays_demo {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        String data = "什么都学,\n" + "阿巴巴巴巴巴, \n"+"邮箱：228676379@qq.com\n" + "联系电话：123456789";
        String string ="(1[3-9]\\d{9}) | (0\\d{1,3}-?\\d{5,8}) | (\\w{5,}@\\w{2,3}\\.com)" + "|400-?\\d{3,7}-?\\d{4}";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            String rs = matcher.group();
            System.out.println(rs);
        }
    }
}
