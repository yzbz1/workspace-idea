package cn.itcast.day07.demo04;

import java.util.ArrayList;

//集合长度可以改变,<E>为泛型,泛型只能是引用类型
//对于arraylist 直接打印得出的不是地址,而直接是内容
public class Demo02ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        System.out.println(list);

        list.add("Oneplus");
        System.out.println(list);

        list.add("xiaomi");
        list.add("huawei");
        list.add("IPhone");
        System.out.println(list);



    }
}
