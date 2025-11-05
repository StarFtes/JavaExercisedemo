package com.zmdyz.demo_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Test_demo5 {
    public static void main(String[] args) throws Exception {
        //创建输入管道（文件）
        InputStream inputStream = new FileInputStream("");
        //创建输处管道（文件）
        FileOutputStream outputStream = new FileOutputStream("");
        // 创建字节数组，转移字节数据
        byte[] buffer = new byte[1024];
        // 记住每次读了多少字节
        int len;
        while ((len = inputStream.read(buffer)) != -1){
            outputStream.write(buffer, 0 ,len);
        }
        outputStream.close();
        inputStream.close();
        System.out.println("复制完成");
    }
}
