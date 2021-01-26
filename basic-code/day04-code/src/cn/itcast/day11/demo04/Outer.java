package cn.itcast.day11.demo04;
/*
局部内部类:定义在方法内部的类
定义格式:
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称(参数列表){
        class 局部内部类名称 {
            //..
        }
    }
}
* */
public class Outer {
    public void methodOuter() {
        class Inner {
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
