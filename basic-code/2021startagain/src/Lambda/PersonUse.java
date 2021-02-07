package Lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
* 使用数组村放多个person
* 对数组中的Person 根据Arrays的sort通过年龄的升序排序
* */
public class PersonUse {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("陈年飞",26),
                new Person("赵家伟",26),
                new Person("芭芭拉",18),
                new Person("巴巴托斯",6000)
        };
        //对数组中的Person,根据Arrays的sort通过年龄的升序排序 (前面-后面)为升序
        /*Arrays.sort(arr,new Comparator<>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        /*
        优化写法使用Lambda
         */
        Arrays.sort(arr,(Person o1,Person o2) -> {
            return o1.getAge() - o2.getAge();
        });


        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }

    }
}
