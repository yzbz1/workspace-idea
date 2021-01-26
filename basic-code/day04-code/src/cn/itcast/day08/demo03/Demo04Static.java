package cn.itcast.day08.demo03;

/*
    静态代码块的格式是:

public class 类名称 {
    static  {
        //静态代码块
    }
}
特点:当第一次用到本类时,静态代码块唯一一次执行
     静态代码块比构造方法先执行 (静态内容总是优先)
典型用途:用来一次性对静态成员变量进行赋值
 */

public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
