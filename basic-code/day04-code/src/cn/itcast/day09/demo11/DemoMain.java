package cn.itcast.day09.demo11;

public class DemoMain {
    public static void main(String[] args) {
        //Animal animal =new Animal();    错误 不能直接创建抽象类

        Cat cat = new Cat();
        cat.eat();
    }
}
