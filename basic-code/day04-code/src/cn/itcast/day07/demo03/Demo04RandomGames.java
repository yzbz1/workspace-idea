package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏 1-100
public class Demo04RandomGames {

    public static void main(String[] args) {
         Random r = new Random();
         Scanner sc = new Scanner(System.in);
         //工具对象
        int result = r.nextInt(100) + 1;
        while(true){
            System.out.println("猜数字游戏,范围[1,100],请输入你猜测的值:");
            int Input = sc.nextInt();
             if (Input > result ){
                 System.out.println("你输入的值大了");
             }else if(Input < result ){
                 System.out.println("你输入的值小了");
             }else{
                 System.out.println("你懂了!!!");
                 break;
             }
         }

    }
}
