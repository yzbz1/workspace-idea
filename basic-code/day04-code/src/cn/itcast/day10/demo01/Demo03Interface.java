package cn.itcast.day10.demo01;
/*
注意:不能通过接口的实现类的对象来调用接口的静态方法
应该通过接口名称直接调用其中的静态方法


*/
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        MyInterfaceStatic.methodStatic();
    }
}
