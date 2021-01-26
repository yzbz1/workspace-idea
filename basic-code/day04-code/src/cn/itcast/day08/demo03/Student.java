package cn.itcast.day08.demo03;

public class Student {

    private String name;
    private int age;
    static String room ;
    private  int id;

    private static int idCounter = 0;   //学号计数器,每次新增一个对象的时候 ++

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public Student() {
        this.id = ++idCounter;
    }
}
