package cn.itcast.day10.demo02;

public class MyInterfance implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");

    }

    @Override
    public void methodsAbs() {
        System.out.println("覆盖重写了AB都有的抽象方法!");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
}
