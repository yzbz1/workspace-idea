package cn.itcast.day06.demo01;

public class Phone {

    String brand;
    double price;
    String color;

    public void call(String Who){
        System.out.println("给"+ Who +"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
