package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {

    }

    public void  receive(ArrayList<Integer> List) {
        //从多个红包中选取一个给自己
        //随机获取一个集合的索引编号
        int index = new Random().nextInt(List.size());
        //根据索引,并从集合中删除
        int money = List.remove(index);
        //将自己的金额增加
        super.setMoney(super.getMoney() + money);

    }
}
