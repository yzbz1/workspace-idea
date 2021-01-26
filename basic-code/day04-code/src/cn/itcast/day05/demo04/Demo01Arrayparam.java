package cn.itcast.day05.demo04;

public class Demo01Arrayparam {

    public static void main(String[] args) {
        int[] arr= {1,2,3};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
