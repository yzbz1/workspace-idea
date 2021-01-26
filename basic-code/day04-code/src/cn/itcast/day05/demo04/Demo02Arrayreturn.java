package cn.itcast.day05.demo04;

public class Demo02Arrayreturn {

    public static void main(String[] args) {
        int[] arr= calculate(1,2,3);
        System.out.println("sum为;" + arr[0]);
        System.out.println("avg为:" + arr[1]);
    }

    public static  int[]  calculate(int a,int b,int c){
        int sum = a + b +c;
        int avg = sum/3;   //2个结果都想返回
        int[] arr = {sum,avg};
        return arr;
    }
}
