package cn.itcast.day06.demo01;

public class Demo02Student {

    public static void main(String[] args) {
        Student Stu = new Student();
        System.out.println(Stu.name);
        System.out.println(Stu.age);

        System.out.println("=================");
        Stu.name = "Kindle";
        Stu.age = 18;
        System.out.println(Stu.name);
        System.out.println(Stu.age);

        Stu.eat();
        Stu.sleep();
        Stu.study();


    }
}
