package cn.itcast.day06.demo03;
//定义年龄时 无法限制不合理的设置
public class Person {

    String name;
    private int age;

    public void show(){
        System.out.println("我叫" + name + ",年龄" + age);
    }

    public void setAge(int num){
        if(num < 100  &&  num >=9){
            age = num;
        } else {
            System.out.println("数据不合理");
        }

    }

    public int getAge(){

        return age;
    }
}
