package cn.itcast.day07.demo05;
//写一个方法 打印集合后显示为  {元素1@元素2}


import java.util.ArrayList;

public class Demo02ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("1号元素");
        list.add("2号元素");
        list.add("3号元素");
        list.add("4号元素");
        System.out.println(list);

        printArrayList(list);
    }


    public static void printArrayList(ArrayList<String> list){
        // {@元素1@元素2}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);

            if(i == list.size() - 1){
                System.out.print(name + "}");
            }else{
                System.out.print(name + "@");
            }


        }


    }
}
