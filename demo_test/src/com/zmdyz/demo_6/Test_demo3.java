package com.zmdyz.demo_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test_demo3 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("src//abc.txt");
        int b ;
        while ((b = inputStream.read())!= -1){
            System.out.println((char)b);
        }
        inputStream.close();
    }
}
