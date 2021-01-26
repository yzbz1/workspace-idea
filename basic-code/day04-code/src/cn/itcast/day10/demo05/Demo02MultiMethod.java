package cn.itcast.day10.demo05;
/*
编译看左边,运行看右边
*
* */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();    //多态

        obj.method();
        obj.methodFu();

    }
}
