package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {

        System.out.println(sum(5,6));
        System.out.println("=========");
        int sum =sum(10,20);
        System.out.println(sum);
    }

    public static int sum(int a,int b){
        int result = a + b;
        return result;
    }
}

