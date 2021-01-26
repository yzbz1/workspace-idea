package cn.itcast.day06.demo03;

public class Demo04Student {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(22);
        stu.setMale(true);

        System.out.println("姓名:" + stu.getNmae());
        System.out.println("是不是爷们:" + stu.isMale());
    }
}
