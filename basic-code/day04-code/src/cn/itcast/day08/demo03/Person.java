package cn.itcast.day08.demo03;

/*
    静态代码块的格式是:

public class 类名称 {
    static  {
        //静态代码块
    }
}
特点:当第一次用到本类时,静态代码块唯一一次执行
 */

public class Person {
    public Person() {
        System.out.println("构造方法");
    }

    static {

        System.out.println("静态代码块执行!");
    }
}

