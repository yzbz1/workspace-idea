package cn.itcast.day07.demo04;

import java.util.ArrayList;


//集合ArrayList只能存放引用数据类型,如果使用基本数据类型 必须使用其对应的包装类


public class Demo05ArraylistBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(100);
        
        list.add(200);

        System.out.println(list);

        Integer num = list.get(0);

        System.out.println("第一号元素是" + num);
    }
}
