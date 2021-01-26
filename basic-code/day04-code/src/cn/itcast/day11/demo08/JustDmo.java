package cn.itcast.day11.demo08;

import java.util.Arrays;

public class JustDmo {
    public static void main(String[] args) {
        long strat = System.currentTimeMillis();

        String s = "a" + "b" + "c";



        long end = System.currentTimeMillis();
        System.out.println("程序共耗时："+(end - strat)+"毫秒");


        //将数组中的指定数据拷贝到另一个数组当中
        int[] src = {1,2,3,4,5};
        int[] dest= {6,7,8,9,10};
        System.out.println("复制前"+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后"+ Arrays.toString(dest));

        //String是常量，值在创建之后不可变，（底层是被final修饰的数组），进行字符串相加就会产生多个字符串，占用空间多效率低下
        //StringBuilder 字符串缓冲区（长度可以变化的字符串），底层也是数组，但是没有被final修饰，可以改变长度.在内存中始终是一个数组，占用空间少,
        //有固定长度超过会自动扩充
        //append返回的是this，（就在自身加数据）
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:"+sb1);

        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb1:"+sb2);

        StringBuilder sb22 = sb2.append("de");
        System.out.println(sb2);
        System.out.println(sb22);
        System.out.println(sb2 == sb22);

        StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append("2");
        builder.append(true);
        builder.append(0.9);
        System.out.println(builder);


        String str = "Helllo";
        StringBuilder builder1 = new StringBuilder(str);
        builder1.append("world");

        String s1 = builder1.toString();
        System.out.println(s1);


        System.out.println("-------------------");
        Integer in1 = new Integer(1);
        Integer in2 = new Integer("1");
        System.out.println(in1);
        System.out.println(in2);

        Integer in3 = Integer.valueOf("1");
        System.out.println(in3);

        int i = in3.intValue();
        System.out.println(i);

        Integer in = 1;   //自动装箱

        in = in+2;   //自动拆箱

        int i1 =100;
        String s2 = i1 + "200";
        System.out.println(s2);

        String s3 = Integer.toString(100);
        System.out.println(s3 + "300");

        String s4 = String.valueOf(100);
        System.out.println(s4 + 400);

        int i2 = Integer.parseInt(s2);
        System.out.println(i2 - 1);







    }

}
