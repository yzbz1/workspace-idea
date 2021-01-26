package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComMethods {
/*可变参数*/
    public static int add(int...arr){
        System.out.println("可变参数地址:"+arr);
        System.out.println("可变参数长度:"+arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(
            Arrays.toString(arr)
                        + "的和为:"
                        + sum
        );
        return sum;
    }

    /*数组的几种输出方式比较*/
    public static void  ArrOut(int[] ns){
        System.out.println("遍历输出:");
        for (int i = 0; i < ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }

        System.out.println("for each循环输出:");
        for(int n : ns){
            System.out.println(n);
        }

        System.out.println("Arrays的toString方法输出:"+Arrays.toString(ns));




    }

}
