package cn.itcast.day08.demo03;

public class Demo03saticStudent {
    //首先设置一下教室  静态的,应该通过类名称调用
    public static void main(String[] args) {
        Student.room = "101教室";


        Student one =new Student("张三" , 20);
        System.out.println("姓名:" + one.getName());
        System.out.println("年龄:" + one.getAge());
        System.out.println("教室:" + one.room);

        System.out.println("=================");

        Student two =new Student("李四" , 21);
        System.out.println("姓名:" + two.getName());
        System.out.println("年龄:" + two.getAge());
        System.out.println("教室:" + two.room);
    }
}
