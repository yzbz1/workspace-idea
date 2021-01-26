package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int sum =getSum(10,20);
        System.out.println("返回值是"+sum);
        System.out.println("===========");
        printSum(10,10);
        //对于没有返回值的方法,只能单独调用
       /* System.out.println(printSum(10,10));*/
    }

    public static int getSum(int a,int b){
        int result =a+b;
        return result;
    }

    public static void printSum(int a,int b){
        int result = a+b;
        System.out.println("打印输出"+ result);
    }
}
