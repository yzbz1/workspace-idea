package cn.itcast.day06.demo04;

public class Demo02Student {

    public static void main(String[] args) {
        Student stu = new Student("小王");
        System.out.println("姓名是:" + stu.getName());
        System.out.println("--------");
        Student stu1 = new Student();
        System.out.println("姓名是:" + stu1.getName());
    }
}
