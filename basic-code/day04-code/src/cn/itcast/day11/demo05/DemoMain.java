package cn.itcast.day11.demo05;
/*
    如果接口的实现类(或者父类的子类)只需要使用唯一一次
    那么这种情况可以省略该类的定义,而改为使用【匿名内部类】

    匿名内部类的格式
    接口名称   对象名 = new 接口名称(){//覆盖重写所有抽象方法};

* */
public class DemoMain {
    public static void main(String[] args) {
        MyInterface impl = new MyInterfaceImpl();
        impl.method();
        //匿名内部类,省略了的了类的名称，impl1是对象名
        MyInterface impl1 = new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类直接实现方法!!");
            }

        };
        System.out.println("============");
        impl1.method();

        //不仅使用匿名内部类，而且使用匿名对象：
        new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类直接实现方法!!");
            }
        }.method();



    }
}
