package cn.itcast.day06.demo04;

public class Person {

    String name;

    public void sayHello(String name){
        System.out.println(name + ",你好.我是" + this.name);
        System.out.println("this值为:"+ this);
    }

}
