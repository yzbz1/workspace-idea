package TreadCommunication;

/**
 * 测试类:
 * 程序执行入口
 * 创建包子对象
 * 创建包子铺,消费者线程
 */
public class Demo01BaoZiTest {
    public static void main(String[] args) {
        ////创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程,开启生产
        new BaoZiPu(bz).start();
        //创建消费者线程,开启吃包子
        new XiaoFeiZhe(bz).start();




    }
}
