package com.zmdyz.demo_4;

public class clone_homework_demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("123","466","789",new double[]{11,22,33});
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getScores());
        System.out.println(user.toString());
        User u1 = (User) user.clone();
        System.out.println(u1.toString());
        System.out.println(u1.getScores());

    }
}