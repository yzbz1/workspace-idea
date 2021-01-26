package cn.itcast.day04.demo03;
//打印指定次数的内容
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(4);
    }

    public static void printCount(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("count"+i);
        }
    }
}
