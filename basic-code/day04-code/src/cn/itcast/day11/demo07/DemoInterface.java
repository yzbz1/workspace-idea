package cn.itcast.day11.demo07;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
/*
接口作为方法的返回值：
接口可以作为方法的参数和返回值

* */

public class DemoInterface {

    public static void main(String[] args) {
        //左边接口名称,右边实现类名称(多态)
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(list.get(i));
        }

    }



    public static List<String> addNames(List<String> list){
        list.add("ana");
        list.add("genji");
        list.add("mercy");
        list.add("tracer");
        return list;
    }

}
