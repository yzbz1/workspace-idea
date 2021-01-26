package cn.itcast.day11.shuangyuanDemo.Demo03;
//斗地主
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
泛型的上限限定：？extend E 代表使用的泛型只能是E类型本身或者E的子类
泛型的下限限定：？ super E 代表使用的泛型只能是E类型的父类或者E本身
* */
public class DouDIZhuDemo {
    public static void main(String[] args) {
        //准备拍 54张
        ArrayList<String> poker = new ArrayList<>();
        //2个数组,花色,序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //将大小王存放到poker
        poker.add("大王");
        poker.add("小王");
        //循环遍历组装52张牌
        for(String number: numbers){
            for (String color : colors) {
                //存贮到扑克中
                poker.add(color + number);
            }
            
        }
        System.out.println(poker);

        //2.洗牌
        Collections.shuffle(poker);
        System.out.println(poker);

        //3.发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //遍历poker 发牌给几个集合

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i>=51){
                diPai.add(p);
            }else if (i%3 == 0){
                player1.add(p);

            }else if (i%3 == 1){
                player2.add(p);

            }else if (i%3 == 2){
                player3.add(p);

            }
        }

        //看牌
        System.out.println("刘德华" + player1);
        System.out.println("周润发" + player2);
        System.out.println("周星驰" + player3);
        System.out.println("底牌" + diPai);


    }

}
