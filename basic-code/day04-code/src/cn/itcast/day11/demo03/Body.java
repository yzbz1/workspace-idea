package cn.itcast.day11.demo03;

public class Body {

    //内部类
    public class InnerBody{
        //内部类成员变量
        private String InnerName = "[内部类成员变量]";
        //内部类方法
        public void beat() {
            System.out.println("内部类方法!");
            //内部类调用外部类私有成员变量
            System.out.println("内部类调用外部类成员变量:"+outterName);

        }
     }
    //外部类的成员变量
    private String outterName = "[外部类成员变量]";

    //外部类方法
    public void method(){
        System.out.println("外部类的方法!");
    }

    //外部类调用内部类
    public void useInnerBodyethod(){
        System.out.println("外部类的方法:调用内部类");
        InnerBody innerBody = new InnerBody();
        innerBody.beat();
    }
}
