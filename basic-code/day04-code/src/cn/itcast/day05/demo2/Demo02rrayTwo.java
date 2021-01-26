package cn.itcast.day05.demo2;

public class Demo02rrayTwo {
    public static void main(String[] args) {
         int[] array =new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        array[1] =10;
        array[2] =20;
        System.out.println(array[0]);
        System.out.println(array[1]); //10
        System.out.println(array[2]);   //20

        int[] array2 =new int[3];
        System.out.println(array2);
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        array2[1] =100;
        array2[2] =200;
        System.out.println(array2[0]);
        System.out.println(array2[1]); //10
        System.out.println(array2[2]);   //20


    }
}
