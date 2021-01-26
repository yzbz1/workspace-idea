package cn.itcast.day05.demo03;

public class Demo04ArrayMax {

    public static void main(String[] args) {
        int[]  arr= {-10,1,6,9,60000,30000};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max =arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< min){
                min =arr[i];
            }
        }

        System.out.println("最大值"+max);
        System.out.println("最小值:" + min);

    }
}
