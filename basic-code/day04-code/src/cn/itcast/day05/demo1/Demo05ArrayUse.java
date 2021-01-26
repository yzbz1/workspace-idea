package cn.itcast.day05.demo1;

public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        System.out.println(arr1);

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        char[] arr2 = new char[3];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        arr1[1] = 123;
        System.out.println(arr1[1]);

    }
}
