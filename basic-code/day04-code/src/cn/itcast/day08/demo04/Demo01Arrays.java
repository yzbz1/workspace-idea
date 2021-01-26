package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
    java.util.Arrays 是一个与数组相关的工具类,里面提供了大量的静态方法,用来实现数组的常用操作

    public static String toString(数组)  :  将参数数组转换成字符串  按照默认格式:[元素1,元素2,...]
    public static void sort(数组)        :  按照默认升序,对元素进行排序
    备注:
    1.如果是数值,sort默认按照升序从小到大
    2.如果是字符串,sort默认按照字母升序
    3.如果是自定义的类型,那么这个自定义的类需要有Comparable或者Comparator接口的支持.
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        int[] intArray1 = {10,2,20,30,6};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        Arrays.sort(intArray1);
        System.out.println(Arrays.toString(intArray1));

        String[] array2 ={"aaa" ,"ccc" ,"bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
