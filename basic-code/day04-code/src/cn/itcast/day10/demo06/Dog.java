package cn.itcast.day10.demo06;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃?");
    }

    public void watchHose(){
        System.out.println("看家!");
    }
}
