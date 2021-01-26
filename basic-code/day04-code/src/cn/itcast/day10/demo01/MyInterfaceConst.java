package cn.itcast.day10.demo01;
/*
接口中定义变量
必须使用public static final 来修饰
从效果是看着就是接口的[常量]
public static final 数据类型 常量名称 = 数据值;
一旦使用final 修饰则该值无法改变
注意事项:
1.接口中的常量可以省略public static final关键字,但是不写要照样是这样
2.接口当中的常量,必须进行赋值;不能不赋值
* */
public interface MyInterfaceConst {
    //其实就是常量,一旦赋值无法修改
    public static final int NUM = 10;
}
