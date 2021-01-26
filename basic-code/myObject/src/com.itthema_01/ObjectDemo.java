package com.itthema_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ObjectDemo {
    public static void main(String[] args) {
        int a=10,b=20;

        char[] ints = new char[10];
        System.out.println(ints[1]);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
        System.out.println(integers.get(1));
        System.out.println(integers.size());
        integers.remove(0);
        System.out.println(integers);
        System.out.println("=====");
        String s = new String();
        System.out.println(s);

        String s1 = "say goodbye";
        String s2 = "say goodbye";
        System.out.println(s1 == s2);

        System.out.println(s1.equals("say goodbye"));
        System.out.println(s1.equalsIgnoreCase("say Goodbye"));  //忽略大小写

        System.out.println(s1.length());
        System.out.println(s1.concat("123312"));
        System.out.println(s1.charAt(0));

        String s3 = Arrays.toString(ints);   //数组转换为字符串
        System.out.println(s3);

        ArrayList<String> list = new ArrayList<>();
        /*list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        System.out.println(list);*/

        Collections.addAll(list,"a","b");
        System.out.println(list);

        Collections.shuffle(list);  //打乱集合

        Collections.sort(list);  //按照默认规则(默认升序)排序


    }

}
