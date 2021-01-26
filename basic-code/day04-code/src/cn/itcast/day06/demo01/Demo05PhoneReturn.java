package cn.itcast.day06.demo01;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.price);
    }

    public static Phone getPhone(){
        Phone Phone = new Phone();
        Phone.price = 8000.0;
        return Phone ;
    }
}
