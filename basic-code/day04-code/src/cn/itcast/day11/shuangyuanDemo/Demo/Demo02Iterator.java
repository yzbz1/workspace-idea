package cn.itcast.day11.shuangyuanDemo.Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("111");
        coll.add("222");
        coll.add("333");
        coll.add("aaa");
        System.out.println(coll);
        Iterator<String> it = coll.iterator();

        String s = new String("123");

        while (it.hasNext()){
             String e = it.next();
             System.out.println(e);
         }

        

    }
}
