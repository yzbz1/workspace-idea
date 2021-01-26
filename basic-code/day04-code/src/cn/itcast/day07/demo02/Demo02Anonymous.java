package cn.itcast.day07.demo02;

public class Demo02Anonymous {

    public static void main(String[] args) {
        Person one = new Person();
        one.name = "二哈";
        one.showName();

        new Person().name = "大橘";
        new Person().showName();


    }
}
