package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo03Anonymous {
    public static void main(String[] args) {
/*        System.out.println("请输入");
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是" + num);
        methodP(new Scanner(System.in));
*/



    Scanner scanner = metod2();

    int num = scanner.nextInt();
    System.out.println("输入的是"+ num);


    }

    public static void methodP(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是"+ i);
    }

    public static Scanner metod2(){
        return new Scanner(System.in);
    }


}
