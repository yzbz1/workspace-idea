package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("清输入第一个数值a:");
        a = sc.nextInt();
        System.out.println("清输入第一个数值b:");
        b = sc.nextInt();
        System.out.println("清输入第一个数值c:");
        c = sc.nextInt();
        max = getmax2(a,b,c);
        System.out.println("最大值为:"+ max);


    }

    public static int getmax(int i,int j, int u){
        int max = 0;
        if (i > j){
            max = i;
        }else{
            max = j;
        }
        if (u > max) {
            max = u;
        }
        return max;
    }

    public static int getmax2(int i,int j, int u){
        int max = i > j ? i:j;
        max = u > max ? u : max;
        return max;
    }
}
