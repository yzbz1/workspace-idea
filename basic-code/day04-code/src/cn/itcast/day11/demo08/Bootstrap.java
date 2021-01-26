package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;
import cn.itcast.day11.red.RedPacketFrame;

/*
发红包案例：
    红包发出去后，所有人都有红包，大家抢完之后，最后一个红包给群主。
    1.普通红包 平均，余数放在最后一个红包里面
    2.手气红包  随机， 最少一分钱，最多不能超过平均数的2倍

1.设置程序标题，通过构造方法的字符串参数
2.设置群主名称
3.设置红包策略

 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("红包界面");
        red.setOwnerName("王思聪");
        OpenMode normal = new NormalMode();
        red.setOpenWay(normal);
    }
}