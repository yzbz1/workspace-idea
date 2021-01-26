package cn.itcast.day06.demo04;

public class Demo01Person {

    public static void main(String[] args) {
        Person per= new Person();
        per.name = "王健林";
        per.sayHello("王思聪");
        System.out.println("==============");
        System.out.println("per值为:" + per);
    }
}
