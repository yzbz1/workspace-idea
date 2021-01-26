package cn.itcast.day09.demo11;
/*
* eat定义为抽象方法,
* 抽象方法:减伤abstract关键字,然后去掉大括号,直接分号结束
* 抽象方法所在的类必须是抽象类,在class前加abstract
*
* 如何使用抽象类和抽象方法
* 1.不能直接new抽象类
* 2.必须要一个子类来继承抽象类
* 3.这个子类必须覆盖重写抽象父类的抽象方法:去掉abstract关键字,补上{}方法体
* 4.创建子类对象进行使用
*/
public abstract class Animal {

    public abstract void eat();

    public void nomalmethod(){

    }
}
