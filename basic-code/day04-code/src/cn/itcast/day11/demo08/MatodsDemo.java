package cn.itcast.day11.demo08;

public class MatodsDemo {

    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 3600 / 24 / 365);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
