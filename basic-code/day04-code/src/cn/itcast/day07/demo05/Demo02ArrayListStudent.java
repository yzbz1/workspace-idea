package cn.itcast.day07.demo05;


import java.util.ArrayList;

//创建一个存放学生类的集合,添加集合,并遍历
public class Demo02ArrayListStudent {


    public static void main(String[] args) {
        Student student1 = new Student("学生1", 22);
        Student student2 = new Student("学生2", 23);
        Student student3 = new Student("学生3", 24);
        Student student4 = new Student("学生4", 25);

        ArrayList<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名:" + list.get(i).getName() +"     "+ "年龄:" + list.get(i).getAge());
        }


    }
}
