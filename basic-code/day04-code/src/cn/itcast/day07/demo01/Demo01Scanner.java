package cn.itcast.day07.demo01;
import java.util.Scanner;
/*
*   应用类型的一般使用步骤
*   1.导包
*   import
*   2.创建
*   3.使用
*
* */
public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("输入的int为"+ i);

        String str = sc.next();
        System.out.println("输入的字符串" + str);

    }
}
