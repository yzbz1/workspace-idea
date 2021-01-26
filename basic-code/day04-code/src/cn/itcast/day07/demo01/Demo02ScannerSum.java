package cn.itcast.day07.demo01;

import java.util.Scanner;

/*键盘输入求和*/
public class Demo02ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("清输入加数i");
        int i = sc.nextInt();
        System.out.println("清输入加数j");
        int j = sc.nextInt();
        int sum = i+j;
        System.out.println("和为:"+ sum);
    }
}
