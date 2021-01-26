package cn.itcast.day07.demo04;
//数组的缺点,一旦创建,长度不可改变
public class Demo01Array {

    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("霸王龙",2);
        Person two = new Person("那方巨兽龙",33);
        Person three = new Person("纳尔",6);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        System.out.println(array[0].getName());



    }
}
