package cn.itcast.day06.demo01;

import java.util.Arrays;

public class Demo01PrintArray {

    public static void main(String[] args) {
        int[] arr1 = {10,20,30};

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i == arr1.length -1 ){
                System.out.println("]");
            }else{
                System.out.print(",");
            }

        }


        System.out.println("===================");
        System.out.println(Arrays.toString(arr1));
    }
}
