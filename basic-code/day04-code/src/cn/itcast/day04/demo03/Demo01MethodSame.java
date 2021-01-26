package cn.itcast.day04.demo03;

//判断数字是否相同
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));
    }

    public static boolean isSame(int a,int b){
        boolean same;
        //same = a==b ? true:false;
        //same = a==b;
        return a==b;
    }
}
