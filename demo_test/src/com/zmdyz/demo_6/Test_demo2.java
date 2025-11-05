package com.zmdyz.demo_6;

import java.io.File;

public class Test_demo2 {
    public static void main(String[] args) {
        search(new File("E:/"),"53.jpg");
    }
    private static void search(File dir, String filename){
        if (dir == null || !dir.exists()|| dir.isFile()){
            return;
        }
        File[] files = dir.listFiles();
        if (files != null && files.length > 0){
            for (File file : files){
                if (file.isFile()){
                    if (file.getName().contains(filename)){
                        System.out.println("找到了"+ file.getAbsolutePath());
                    }
                }else {
                    search(file, filename);
                }
            }
        }
    }

}
