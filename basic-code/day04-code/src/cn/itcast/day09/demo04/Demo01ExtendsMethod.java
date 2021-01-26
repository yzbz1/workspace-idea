package cn.itcast.day09.demo04;
/*
在父子类的继承关系当中,创建子类对象,访问尘缘方法的规则:
    创建的对象是谁,就用谁,如果没有则向上找
注:无论是成员方法还是成员变量,如果没有都向上找父类的,绝对不会向下找子类的

重写(Overide)
在继承关系当中,方法的名称一样,参数列表也一样

重写(override):方法的名称一样,参数列表【也一样】  方法的覆盖
重载(overload)：方法名称一样，参数列表【不一样】

方法的重写方法,创建的是子类对象,则优先使用子类方法
*/

public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        zi.method();
    }
}
