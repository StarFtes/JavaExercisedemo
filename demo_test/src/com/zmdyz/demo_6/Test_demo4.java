package com.zmdyz.demo_6;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test_demo4 {
    public static void main(String[] args)  throws Exception{
        InputStream inputStream = new FileInputStream("src//abc.txt");
        byte[] buffer = new byte[1048];
        int b;
        while ((b = inputStream.read(buffer)) != -1){
            String rs =new String(buffer, 0 , b );
            System.out.println(rs);
        }
        inputStream.close();
    }
}
