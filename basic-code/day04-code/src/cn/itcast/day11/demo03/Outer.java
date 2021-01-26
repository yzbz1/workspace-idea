package cn.itcast.day11.demo03;

public class Outer {
    //外部类的成员变量
    int num = 10;

    public class Inner {
        //内部类的成员变量
        int num = 20;

        public void methodIn() {
            //内部类方法的局部变量
            int num = 30;


            System.out.println(num);//局部变量,就近原则
            System.out.println(this.num);//内部类的成员变量

            System.out.println(Outer.this.num);//外部类的num
        }

    }
}
