package cn.itcast.day06.demo04;

public class Student {
    private String name;

    public Student(){
        System.out.println("空参构造"); ;

    }

    public Student(String name){
        System.out.println("全参构造"); ;
        this.name = name ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
