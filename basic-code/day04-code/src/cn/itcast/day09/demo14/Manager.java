package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
         ArrayList<Integer> redlist = new ArrayList<Integer>();
         int leftMoney = super.getMoney();  //群主当前余额
        if(totalmoney > leftMoney){
            System.out.println("余额不足!");
            return redlist;     //返回空集合
        }
        //扣钱重新设置余额
        super.setMoney(leftMoney - totalmoney);
        //发红包平均拆分为count 份
        int avg = totalmoney / count;
        int mod = totalmoney % count;   //余数
        //剩下的零头,抱在最后一个红包中
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;
        redlist.add(last);
        return redlist;
            
        }

}
