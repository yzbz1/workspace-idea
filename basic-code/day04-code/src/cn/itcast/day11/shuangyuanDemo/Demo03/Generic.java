package cn.itcast.day11.shuangyuanDemo.Demo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

    }
        //定义一个能够遍历所有数据类型的ArrayList集合
        //我们不知道数据类型，所以使用泛型通配符？来接受数据,泛型没有继承概念
        public static void printArray(ArrayList<?> list){
            Iterator<?> it = list.iterator();
            while(it.hasNext()){
                Object o = it.next();
                System.out.println(o);
            }

        }
}
