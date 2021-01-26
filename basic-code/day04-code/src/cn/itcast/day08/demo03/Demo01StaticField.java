package cn.itcast.day08.demo03;
/*
如果一个成员变量使用了static关键字,那么这个变量就直接属于类的


 */
public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("南山",18);
        Student two = new Student("北海",16);
        one.room = "101教室";

        System.out.println("姓名:" + one.getName() + ",年龄:" + one.getAge() + ",教室:" + one.getRoom() +",学号:"+ one.getId());
        System.out.println("姓名:" + two.getName() + ",年龄:" + two.getAge() + ",教室:" + one.getRoom() +",学号:"+ two.getId());
    }
}
