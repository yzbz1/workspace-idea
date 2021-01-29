package test1;

import java.util.List;

public class Demo01Exception {
    public static void main(String[] args) {
        /*多个异常捕获处理
            1.多个异常分别处理
            2.一次捕获,多次处理
            3.一次捕获,一次处理
        * */
        int[] arr = {1,2,3};

        try{
            System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println(e);
        }

        List<Integer> list = List.of(1, 2, 3);
        try{
            System.out.println(list.get(4));
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("后续");

        //一个try 多个catch注意事项
        //catch里面的异常变量如果以后父子关系,那么子类必须写在上面
    }
}
