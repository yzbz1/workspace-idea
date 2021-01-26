package com.itthema_01;

public interface Test {
    int a = 0;

    public default void test1() {
        System.out.println(1);
    }

}
