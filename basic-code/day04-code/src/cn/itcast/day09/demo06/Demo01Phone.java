package cn.itcast.day09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();

        System.out.println("===================");

        NewPhone nphone = new NewPhone();
        nphone.call();
        nphone.send();
        nphone.show();
    }
}
