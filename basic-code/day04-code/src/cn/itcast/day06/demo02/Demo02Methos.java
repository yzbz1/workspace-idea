package cn.itcast.day06.demo02;

public class Demo02Methos {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3};

        int max = getMax(arr);
        System.out.println(max);

    }
    public static int getMax(int[] arr){
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }

}
