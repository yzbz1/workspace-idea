package cn.itcast.day11.shuangyuanDemo.Demo04;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        System.out.println(list);

        list.add(3,"it");
        System.out.println(list);

        String s = list.remove(2);
        System.out.println(s);
        System.out.println(list);

        String s1 = list.set(4, "A");
        System.out.println(s1);
        System.out.println(list);
        System.out.println("=======普通for循环==========");
        for (int i = 0; i < list.size(); i++) {
            String s2 = list.get(i);
            System.out.println(s2);
        }
        System.out.println("=======迭代器循环==========");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }

        System.out.println("=======增强循环==========");
        for (String s2 : list) {
            System.out.println(s2);

        }
    }
}
