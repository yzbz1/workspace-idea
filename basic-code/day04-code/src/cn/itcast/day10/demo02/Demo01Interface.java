package cn.itcast.day10.demo02;
/*
使用接口的时候,需要注意:
1.接口没有静态代码块或者后遭方法的
2.一个类的直接父类是惟一的,但一个类可以同时实现多个接口
格式:
public class MyInterface implements MyInterfaceA,MyInterfaceB{
    //覆盖重写的抽象方法
}
3.如果实现的多个接口当中存在重复的抽象方法,那么只要实现一次就可以了
4.如果实现类没有覆盖重写所有接口中的所有抽象方法,那么实现类必须为抽象类
* */
public class Demo01Interface {
}
