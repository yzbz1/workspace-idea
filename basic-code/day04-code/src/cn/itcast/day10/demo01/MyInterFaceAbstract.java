package cn.itcast.day10.demo01;
/*
在任何版本的java中,接口都能定义抽象类
public abstract 返回值类型 方法名称(参数列表);

注意:
1.接口中的抽象方法,修饰符必须是2个关键字:public abstract
2.这2个关键字修饰符,可以选择性的省略(也可以全省略)
3.方法的3要素可以随意定义
*/
public interface MyInterFaceAbstract {
    //抽象方法
    public abstract void methodAbs1();

    //这也是抽象方法
    abstract void methodAbs2();
    //这也是抽象方法
    public  void methodAbs3();
    //这也是抽象方法
    void methodAbs4();
}
