package cn.itcast.day10.demo06;
//对象 instanceof 类型    判断前面对象能不能成为后面类的实例
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHose();
        }
        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
