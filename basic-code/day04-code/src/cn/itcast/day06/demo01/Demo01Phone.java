package cn.itcast.day06.demo01;

public class Demo01Phone {

    public static void main(String[] args) {
        Phone ph = new Phone();
        System.out.println(ph.brand);
        System.out.println(ph.price);
        System.out.println(ph.color);

        System.out.println("=============");
        ph.brand = "苹果";
        ph.price = 6000.0;
        ph.color = "玫瑰金";
        System.out.println(ph.brand);
        System.out.println(ph.price);
        System.out.println(ph.color);

        ph.call("乔布斯");
        ph.sendMessage();

    }
}
