package cn.itcast.day10.demo01;
/*
静态方法的使用场景:
抽取一个共有方法,用来解决重复代码问题,
但是这个共有方法,又不能给实现类访问,所以有了私有方法
从java9开始,接口当中允许定义私有方法
1.普通私有方法,解决多个默认方法之间重复代码的问题
格式:
private 返回值类型 方法名称(参数列表){
    方法体
}
2.静态私有方法:解决多个静态方法之间重复代码的问题
格式:
private static 返回值类型 方法名称(参数列表){
    方法体
}

* */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1!");
        System.out.println("AAA");
    }
    public default void methodDefault2(){
        System.out.println("默认方法2!");

    }

    /*private default void common(){
        System.out.println("AAA");
    }*/

    //java8暂时不支持


}
