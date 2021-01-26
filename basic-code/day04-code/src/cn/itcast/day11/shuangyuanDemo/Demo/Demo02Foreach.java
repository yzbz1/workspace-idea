package cn.itcast.day11.shuangyuanDemo.Demo;

import java.util.ArrayList;

/*
增强for循环：底层迭代器，格式佛如循环

* */
public class Demo02Foreach {
    public static void main(String[] args) {
        //demo01();
        demo02();

    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for(String i:list){
            System.out.println(i);
        }

    }

    private static void demo01(){
        int[] arr = {1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }

    }
}
