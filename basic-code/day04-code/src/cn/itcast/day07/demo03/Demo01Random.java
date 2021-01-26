package cn.itcast.day07.demo03;
import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt();
        System.out.println("随机数是;"+ i);
        int i1 = r.nextInt(25);
        System.out.println("[0,25)的随机数是:"+ i1);
    }
}
