package cn.itcast.day04.demo04;

public class Demo04OverloadPrint {
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }
}
