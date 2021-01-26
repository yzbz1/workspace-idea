package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        // 随机数1到n
        int n = 10;
        Random r  = new Random();

        for (int i = 0; i < 10; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println("随机范围[1,10]的数值是:" + result);
        }

    }
}
