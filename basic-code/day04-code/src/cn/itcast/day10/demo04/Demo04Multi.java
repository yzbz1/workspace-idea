package cn.itcast.day10.demo04;
/*
*  多态:父类引用指向子类对象
*  格式:
*  父类名称 对象名 = new 子类名称();
*  接口名称 对象名 = nwe 实现类名称();
*
*
* */
public class Demo04Multi {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();
    }
}
