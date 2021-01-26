package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainredPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主" , 100);
        Member one = new Member("成员A" , 0);
        Member two = new Member("成员B" , 10);
        Member three = new Member("成员C" , 100);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("====================");
        //群主发红包
        ArrayList<Integer> redList = manager.send(20 , 3);
        //普通成员手红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);


        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
