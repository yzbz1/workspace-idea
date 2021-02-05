package TreadCommunication;

public class BaoZiPu extends Thread {
    //1.创建一个包子变量
    private BaoZi bz;
    //2.使用带参数的构造方法,为包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }
    //设置线程任务
    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        while (true){
            synchronized(bz){
                if (bz.status == true){
                    try {
                        bz.wait();    //被唤醒后会执行wait之后的代码
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行(生产2种包子)
                if(count%2 == 0){
                    //生产三鲜包子
                    bz.pi = "薄皮";
                    bz.Xian = "三鲜";
                }else{
                    bz.pi = "水晶皮";
                    bz.Xian = "牛肉玉米";
                }
                count++;
                System.out.println("包子铺正在生产"+bz.pi+bz.Xian+"包子");
                //生产包子消耗时间
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改包子状态
                bz.status = true;
                bz.notify();
                System.out.println("以生产:"+bz.pi+bz.Xian+"包子");
            }
        }

    }
}
