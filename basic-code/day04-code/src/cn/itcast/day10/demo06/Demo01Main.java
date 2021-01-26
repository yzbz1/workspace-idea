package cn.itcast.day10.demo06;

public class Demo01Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        ((Cat) animal).catchMouse();


        Cat cat = (Cat)animal;
        cat.catchMouse();

        Dog dog = (Dog)animal;  //运行错误   ClasscaseException  类转换异常


    }
}
