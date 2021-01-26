package cn.itcast.day05.demo03;

//数组元素的反转,不能使用新数组
public class Demo07Reverse {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int min = 0,max = arr1.length - 1 - min; min < max; min++, max--) {

            System.out.println("方法执行");
            int temp = arr1[min];
            arr1[min] = arr1[max];
            arr1[max] = temp;


        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
