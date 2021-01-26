package cn.itcast.day04.demo03;
//求1~~100和
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是"+sum100());
    }
    public static int sum100(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }

        return sum;
    }


}
