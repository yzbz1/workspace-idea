package cn.itcast.day09.demo09;
/*
super 关键字用来访问父类内容,而this关键字用来访问本类内容,三种用法:
1.在本类的成员方法中,访问本类的成员变量
2.在本类的成员方法中,访问另一个成员方法
3.在本类的构造方法中,访问本类的另一个构造方法
注;this(...)也必须是构造方法的第一个语句,唯一一个
   super 和this两种构造方法不能同时调用,我调用了this就不会在赠送super了

 */
public class Zi extends Fu {
    public Zi() {
        this(123);
    }

    public Zi(int n) {

    }

    public Zi(int n, int m) {
        this();

    }

    int num = 20;
    public void showNum(){
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
