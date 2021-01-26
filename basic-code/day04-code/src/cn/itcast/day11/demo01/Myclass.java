package cn.itcast.day11.demo01;
/*
final修饰一个类的时候，格式：
public final class 类名称{
    。。。
}
含义：这个类不能有子类
* */
public final class Myclass {
    public void method(){
        System.out.println("final类的方法！");
    }
}
