package cn.itcast.day11.demo03;
/*
内部类:
分类:
1.成员内部类
2.局部内部类(包含匿名内部类)

成员内部类的定义格式:
修饰符  class 外部类名称 {
    修饰符  class 内部类名称
    {     //..              }
    //..
}
注意:内用外,随意访问;外用内,需要内部类对象
===============================
使用内部类的2种方式:
1.间接方式:在外部类的方法中,使用内部类,main 只调用外部类的方法
2.直接方法:公式:【外部类名称.内部类名称 对象名 = new 外部类名称().内部类名称();】

* */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        //通过外部类的方法,间接调用内部类
        body.useInnerBodyethod();
        System.out.println("====================");
        //直接创建内部类对象访问
        Body.InnerBody innnerBody = new  Body().new InnerBody();

        innnerBody.beat();




    }

}
