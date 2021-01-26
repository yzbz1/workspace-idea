package cn.itcast.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void method() {
        System.out.println("实现了抽象方法,BBB");
    }

    @Override
    public void method2() {
        System.out.println("重写了接口的默认方法!");
    }

    ;
}
