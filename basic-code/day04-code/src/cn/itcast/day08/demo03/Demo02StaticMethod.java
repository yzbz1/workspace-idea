package cn.itcast.day08.demo03;
/*
    使用static修饰成员方法，那么就是静态方法
    静态方法不属于对象，而是属于类
    普通成员方法必须使用对象调用
    对于静态方法可以使用对象调用,也可以使用类直接调用 [推荐使用类名调用]
    对于本类当中的静态方法可以省略类名直接调用,  javac翻译同样会翻译成[类名.静态方法]

    注:
    1.静态不能直接访问新静态,  原因:因为内存当中先有的静态,后有非静态内容
    2.静态方法当中不能使用this   原因：this 代表当前对象,通过谁调用的方法,谁就是当前对象,而静态方法是通过类调用的

 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.method();

        //对于静态方法可以使用对象调用,也可以使用类直接调用

        obj.methodstatic();   //这种写法也会被javac翻译成[类.静态方法]
        Myclass.methodstatic();

        myMethods();


    }

    public static void myMethods(){
        System.out.println("自己的方法!");
    }
}
