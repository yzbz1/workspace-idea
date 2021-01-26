package cn.itcast.day10.demo01;

/*
接口使用步骤:
1.接口不可以直接使用,必须有一个实现类来实现该接口
格式:
public class 实现类名称 implements 接口名称 {  ...  }
2.接口的实现类必须覆盖重写(实现)该接口的所有抽象方法
实现:去掉abstract 增加方法体大括号
3.创建实现类的对象进行使用.

注意事项:
如果实现类没有覆盖重写接口中的所有方法,那么这个实现类必定是抽象类
*/


public class Demo01Interface {

    public static void main(String[] args) {
        //MyInterFaceAbstract inter = new MyInterFaceAbstract();  直接new 接口错误
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }
}
