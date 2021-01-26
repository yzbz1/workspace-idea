package cn.itcast.day09.demo01;

/*
在继承关系中,"类就是一个父类"    is-a

public class 子类名称 extends 父类名称{
    // ...
}

*/

public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher te = new Teacher();
        te.method();


        Assistant as = new Assistant();
        as.method();
    }
}
