package cn.itcast.day11.shuangyuanDemo.Demo04;

import  java.lang.String;

import java.util.HashSet;

public class PublicDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        String s1 = new String("abc");
        String s2 = new String("abc");

        set.add(s1);
        set.add(s2);
        set.add("通话");
        set.add("重话");
        set.add("abc");
        System.out.println(set);

        HashSet<String> set1 = new HashSet<>();

        set1.add("abc");
        set1.add("abc");
        set1.add("WWW");
        set1.add("itcast");
        System.out.println(set1);

        System.out.println(add(10,209,222));


    }

    public static int add(int...arr){
        int sum = 0;  //记录数值
        for (int i : arr) {
            //累加
            sum += i;
        }
        return sum;
    }

}
