package cn.itcast.day06.demo01;

public class Demo02PhoneTwo {

    public static void main(String[] args) {
        Phone ph = new Phone();
        System.out.println(ph.brand);
        System.out.println(ph.price);
        System.out.println(ph.color);
        ph.brand = "苹果";
        ph.price = 6000.0;
        ph.color = "玫瑰金";
        System.out.println(ph.brand);
        System.out.println(ph.price);
        System.out.println(ph.color);

        ph.call("乔布斯");
        ph.sendMessage();


        System.out.println("===============");

        Phone ph2 = ph;
        System.out.println(ph2.brand);
        System.out.println(ph2.price);
        System.out.println(ph2.color);
        ph2.brand = "三星";
        ph2.price = 5999.0;
        ph2.color = "蓝色";
        System.out.println(ph2.brand);
        System.out.println(ph2.price);
        System.out.println(ph2.color);

        ph2.call("欧巴");
        ph2.sendMessage();

    }
}
