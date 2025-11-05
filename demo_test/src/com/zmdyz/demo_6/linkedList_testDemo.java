package com.zmdyz.demo_6;
// 这是一个队列
import java.util.LinkedList;

public class linkedList_testDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("1");
        linkedList.push("2");
        linkedList.push("3");
        System.out.println(linkedList);

//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeFirst());

// 遍历linkedList
        for (int i = 0; i < 3; i++){
            System.out.println(linkedList.removeFirst());
        }
    }
}
