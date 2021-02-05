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
                System.out.println("消费者正在吃"+bz.pi+"");

            }
        }
    }
}
