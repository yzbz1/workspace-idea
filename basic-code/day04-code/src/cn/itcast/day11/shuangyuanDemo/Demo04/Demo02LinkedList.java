package cn.itcast.day11.shuangyuanDemo.Demo04;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.pop();
        System.out.println("被移除的第一个元素后的集合"+linked);

        linked.removeLast();
        System.out.println("再被移除的最后元素后的集合"+linked);

        System.out.println();



    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("www");
        System.out.println(linked);
        linked.push("com");
        System.out.println(linked);

        linked.addLast("qqq");
        System.out.println(linked); //就是add 方法

        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
        System.out.println("-----------");

        linked.clear();
        if (!linked.isEmpty()){
            System.out.println(linked.getLast());
        }else{
            System.out.println("集合为空!");
        }




    }
}
