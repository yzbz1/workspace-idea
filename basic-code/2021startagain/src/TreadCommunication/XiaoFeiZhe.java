package TreadCommunication;

public class XiaoFeiZhe extends Thread{
    //1.包子变量
    private BaoZi bz;

    public XiaoFeiZhe(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务吃包子
    @Override
    public void run() {
        //使用死循环 持续进程运行
        while (true){
            //使用同步,保证只有一个线程在执行
            synchronized(bz){
                if (bz.status == false){
                    //没有包子 进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后的代码
                System.out.println("消费者正在吃"+bz.pi+bz.Xian+"包子");
                //吃完包子,修改状态
                bz.status = false;
                //唤醒包子铺线程,生产包子
                bz.notify();
                System.out.println("消费者吃完"+bz.pi+bz.Xian+"包子"+"开始生产");
                System.out.println("----------------");
            }
        }
    }
}
