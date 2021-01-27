import useMod.Person;
//make something change
import java.util.*;

public class CeMain {
    public static void main(String[] args) {
        System.out.println("2021再启程");
        // map遍历方法1:通过键找值的方法获取 keySet
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三",3);
        map.put("李四",4);
        map.put("王五",5);
        System.out.println(map);
        /*第一种遍历方式:将key取出存放到set集合,然后遍历set根据取出的key获取对应的value*/
        Set<String> set = map.keySet();
        System.out.println(set);  //取出key
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key+","+value);
        }
        System.out.println("-----------");
        /*第二种遍历方式:将map元素entry取出存放至set,然后使用getkey,getvalue*/
        Set<Map.Entry<String, Integer>> setEn = map.entrySet();
        for (Map.Entry<String,Integer> entry:setEn    //遍历entry
             ) {
            System.out.println(entry.getKey()+','+entry.getValue());
        }
        System.out.println("-------");
        MethodMapSavePerson01();
        MethodMapSavePerson02();

        //练习:统计字符串各个字符的个数
        System.out.println("字符统计");
        CharSum();



        /*JDK9的新特性
         * List Set Map 增加了of方法 可以一次性给集合添加多个元素
         * 使用前提:当集合中存储的个数已经确定的时候使用
         * */
        List<String> listdemo = List.of("a", "b", "c", "e");
        System.out.println(listdemo);


    }

    private static void CharSum() {
        //用户输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        //统计字符 创建集合map k为字符,v为字符个数
        HashMap<Character, Integer> map = new HashMap<>();
        //遍历字符串,获取每一个字符
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == null){
                map.put(chars[i],1);
            }
            else{
                map.put(chars[i],map.get(chars[i]) + 1);

            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry: set) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        
    }

    private static void MethodMapSavePerson01() {
        HashMap<String, Person> mapPerson = new HashMap<>();
        mapPerson.put("北京",new Person("张三",13));
        mapPerson.put("上海",new Person("李四",14));
        mapPerson.put("苏州",new Person("王五",15));
        mapPerson.put("北京",new Person("赵六",16));

        Set<String> strings = mapPerson.keySet();
        for (String key:strings
             ) {
            Person value = mapPerson.get(key);
            System.out.println(key+','+value);
        }
    }

    /*使用person作为key,因为key要具有唯一性,所以要是hashmap能够区分的类型,存贮的类型必须要实现hashcode和equals方法*/
    private static void MethodMapSavePerson02() {
        HashMap<Person, String> map = new HashMap<Person, String>();

        map.put(new Person("张三",13),"中国");
        map.put(new Person("李四",14),"日本");
        map.put(new Person("张三",13),"法国");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+","+value);
        }


    }



}
