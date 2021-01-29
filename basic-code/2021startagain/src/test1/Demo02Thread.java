package test1;

import useMod.Person;

/**
    创建多线程程序的第一种方式
    1.创建Thread的子类
        继承Thread类 -> 在子类中重写Thread类中的run方法,设置线程任务   -> 创建Thread类的子类对象
        -> 调用Thread类中的方法 start 方法 开启新的线程,执行run 方法
 */
public class Demo02Thread {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用Thread类中的start 方法,开启新线程
    }
}
