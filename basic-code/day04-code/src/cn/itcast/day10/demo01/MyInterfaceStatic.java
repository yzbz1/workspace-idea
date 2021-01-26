package cn.itcast.day10.demo01;
/*
从java8开始接口允许定义就心态方法
格式:
public static 返回值类型 方法名称(参数列表){
    方法体
}
提示:就是将abstract或者default缓存static即可,携带方法体
*/
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("接口的静态方法!");
    }
}
