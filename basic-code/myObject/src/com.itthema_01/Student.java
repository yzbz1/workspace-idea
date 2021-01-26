package com.itthema_01;

public class Student {
    public static void main(String[] args) {
        Object demo = new Object();
        int one = 1;
        System.out.println(demo);
        System.out.println(demo.toString());
        boolean be = demo.equals(one);
        System.out.println(be);
        System.out.println("--------------");
        System.out.println(System.currentTimeMillis());
    }
}
