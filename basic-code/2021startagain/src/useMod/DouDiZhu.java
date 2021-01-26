package useMod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DouDiZhu {

    public static void main(String[] args) {
        //使用一个map 存放牌的索引和内容
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个集合存放索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义2个集合存放序号和花色
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♣","♠","♦");

        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");

        //将大王小王存放到集合中
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        /*System.out.println(poker);
        System.out.println(pokerIndex);*/

        //洗牌 Collections 的shuffle 方法
        Collections.shuffle(pokerIndex);


        //发牌  定义四个集合 用户和底牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //遍历存储牌索引的list集合获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //判断底牌
            if (i>=51){
                diPai.add(in);
            }else if (i%3 == 0){
                //玩家1发牌
                player01.add(in);
            }else if (i%3 == 1){
                //玩家2发牌
                player02.add(in);
            }else if (i%3 == 2){
                //玩家3发牌
                player03.add(in);
            }
        }

        //对牌进行排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        //看牌

        lookPoker("张三",poker,player01);
        lookPoker("李四",poker,player02);
        lookPoker("王五",poker,player03);
        lookPoker("底牌",poker,diPai);





    }
    /*定义一个看牌的方法*/
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //输出玩家名
        System.out.print(name+":");
        for (Integer key : list) {
            String s = poker.get(key);
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
