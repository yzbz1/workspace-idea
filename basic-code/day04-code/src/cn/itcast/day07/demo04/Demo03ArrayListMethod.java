package cn.itcast.day07.demo04;

/*
*  public boolean add(E e):  像集合中添加元素,参数类型和泛型一致
*  对于ArrayList集合来说,add方法肯定是成功的,所以返回值可用可不用,但是对于其他集合来说add不一定成功
*  public E get(int index): 从集合中获取元素,参数是索引编号,返回值对应位置的元素
*  public E remove(int index):从集合中删除元素,参数是索引编号,返回值就是被删掉的元素
*  public int size():    获取集合的长度,返回值是集合包含的元素个数
* */


import java.util.ArrayList;

public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        System.out.println(list);

        //添加元素
        boolean ifsuccess = list.add("添加元素");
        System.out.println(list);
        System.out.println("添加方法是否成功"+ifsuccess);

        list.add("第二元素");
        list.add("第三元素");

        //获取集合元素:get  索引值从0开始
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        String name = list.get(0);
        
        //从集合中删除元素 索引值从0开始
        String whoRmoved = list.remove(0);

        System.out.println("被删除的元素是:" + whoRmoved);

        System.out.println(list);

        //获取集合长度
        int size = list.size();

        System.out.println("集合长度:" + size);


    }

}
