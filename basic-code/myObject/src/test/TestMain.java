package test;



import java.net.ConnectException;
import java.util.*;

import static java.lang.Math.*;

public class TestMain {
    public static void main(String[] args) {
        /*可变参数*/
        int add = ComMethods.add();
        int add0 = ComMethods.add(10);
        int add1 = ComMethods.add(1,2);

        /*集合的几种输出方式*/
        int[] ns = {1,2,3,4};
        ComMethods.ArrOut(ns);

        /*Collections集合工具类*/
        //1.往集合中添加多个元素Collections.addAll
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        System.out.println(list);

        //2.打乱集合元素顺序Collections.shuffle
        Collections.shuffle(list);
        System.out.println(list);

        //3.将集合元素按照默认规则排序(升序)
        Collections.sort(list);
        System.out.println(list);
        //对于存放自定义对象的数组进行排序
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三",18));
        list1.add(new Person("李四",20));
        list1.add(new Person("王五",19));
        System.out.println(list1);
        Collections.sort(list1);

        //自定义的对象想要实现排序需要实现指定接口Comparable<String>接口,重写CompareTo(T t)方法
        Collections.sort(list1);
        System.out.println(list1);

        //Collections.sort();集合，和Comparator（INteger）（）方法

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        System.out.println(list2);
        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;   //升序，反之则为降序 
            }
        });

        System.out.println("list2排序后"+list2);

        /*math常量测试*/
        System.out.println(PI);
        System.out.println(E);

        /*强制类型转换*/
        double x = 9.97;
        int nx = (int)x;
        int rx = (int)Math.round(x);
        System.out.println(x);
        System.out.println(nx);
        System.out.println(rx);

        /*超范围,数据截取造成的结果完全不同情况*/
        int b = 300;
        System.out.println(b);      //300
        System.out.println((byte)b);//44
        
        show01();
        show02();
    }

    private static void show02() {

    }

    private static void show01() {
        //常见map集合
        HashMap<String,String> map = new HashMap<>();
        String v1 = map.put("理财", "麦克雷1");
        System.out.println("V1"+v1);
        String v2 = map.put("理财", "麦克雷2");
        System.out.println("V2"+v2);
        map.put("开苦练","源氏");
        map.put("哇嘎","半藏");
        System.out.println(map);

        String de1 = map.remove("理财");
        System.out.println("de1"+de1);
        System.out.println(map);
        String de2 = map.remove("理财");
        System.out.println("de2"+de2);
        String g1 = map.get("哇嘎");
        System.out.println(g1);

        String g2 = map.get("haha");
        System.out.println(g2);

        boolean c = map.containsKey("哇嘎");
        boolean c1 = map.containsKey("哇嘎1");
        System.out.println("c:"+c+","+"c1:"+c1);



    }

}
