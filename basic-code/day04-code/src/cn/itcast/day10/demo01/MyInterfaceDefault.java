package cn.itcast.day10.demo01;
/*
从java8开始,接口里允许定义默认方法
格式:
public default 返回值类型 方法名称(参数列表){
    方法体
}
备注:接口中的默认方法,可以解决接口升级的问题
*/
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void method();
    //新添加一个抽象方法
    public default void method2(){
        System.out.println("新添加的默认方法");
    };
}
