package cn.itcast.day11.shuangyuanDemo.Demo04;

import cn.itcast.day06.demo01.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo02Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //add方法添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }


        //增强for
        for (Integer integer : set) {
            System.out.println(integer);
        }


        Student student = new Student();
        Student student2 = new Student();

        System.out.println(student.hashCode());
        System.out.println(student);

        System.out.println(student2.hashCode());
        System.out.println(student2);

        String s = new String("abc");
        int i = s.hashCode();
        System.out.println(i);

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());


    }
}
