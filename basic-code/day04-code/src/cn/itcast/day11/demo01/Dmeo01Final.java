package cn.itcast.day11.demo01;
/*
final关键字四种常用的用法


*/
public class Dmeo01Final {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        num = 20;
        System.out.println(num);

        final int num2 = 200;
        System.out.println(num2);
        //num2 = 600;

        final Student student = new Student("赵丽颖");
        System.out.println(student);

        //student = new Student("高圆圆");
        System.out.println(student);
    }
}
