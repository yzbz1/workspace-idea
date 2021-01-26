package cn.itcast.day07.demo04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

//大集合存放20个数字,筛选其中的偶数元素,放到小集合当中
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1; //1-100
            biglist.add(num);
        }

        ArrayList<Integer> smallList = getSmallArraylist(biglist);
        System.out.println("偶数总共"+ smallList.size() +"个");
        System.out.println(smallList);
        System.out.println("------------");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

        
    }


    public static ArrayList<Integer> getSmallArraylist(ArrayList<Integer> biglist){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
             int num = biglist.get(i);
            if (num%2 ==0){
                smallList.add(num);
            }
            
        }

        return smallList;
    }
}
