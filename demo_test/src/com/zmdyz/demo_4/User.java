package com.zmdyz.demo_4;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private String id;
    private String userName;
    private String password;
    private double[] scores;

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public double[] getScores() {
        return scores;
    }

    public User(String id, String userName, String password, double[] scores) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.scores = scores;
    }

    public User() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

