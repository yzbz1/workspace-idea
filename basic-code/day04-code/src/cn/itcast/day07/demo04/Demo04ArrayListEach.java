package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {


    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("喀嚓");
        list.add("猫头鹰");
        list.add("狮鹫");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }







    }

}
