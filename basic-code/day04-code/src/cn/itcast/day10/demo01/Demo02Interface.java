package cn.itcast.day10.demo01;
/*
1.接口的默认方法,可以通过接口的实现类对象,直接调用
2.接口的默认方法,也可以被接口实现类进行覆盖重写
*/
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.method2();    //MyInterfaceDefaultA并没有实现该方法,但是该方法为接口的默认方法,直接可以使用


        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.method2();
    }
}
