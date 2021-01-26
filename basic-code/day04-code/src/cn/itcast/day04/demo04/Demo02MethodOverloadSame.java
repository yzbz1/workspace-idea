package cn.itcast.day04.demo04;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a =10;
        byte b =20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)a,(short)b));
        System.out.println(isSame(10L,10L));

    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("2个byte方法的执行");
        boolean same;
        if (a == b) {
            same = true;
        }else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("2个short方法的执行");
        return a==b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("2个long方法的执行");
        return a==b;
    }
}
