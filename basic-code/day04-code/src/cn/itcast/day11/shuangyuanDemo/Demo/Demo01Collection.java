package cn.itcast.day11.shuangyuanDemo.Demo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> integers = new ArrayList<>();
        System.out.println(integers);
        boolean bl = integers.add("张三");
        System.out.println(bl);
        System.out.println(integers);
        integers.add("张三");
        integers.add("李四");
        integers.add("王五");
        System.out.println(integers);

        integers.remove("李四");
        System.out.println(integers);

        boolean remove = integers.remove("1四");
        System.out.println(remove);
        System.out.println(integers);


        boolean b = integers.contains("张三");
        System.out.println(b);

        boolean b1 = integers.isEmpty();
        System.out.println("b1:"+b1);


        System.out.println(integers.size());

        //将集合元素存放到数组当中
        Object[] array = integers.toArray();
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        integers.clear();
        System.out.println(integers);

    }
}
