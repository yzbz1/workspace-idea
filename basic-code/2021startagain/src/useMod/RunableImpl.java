package useMod;
//1创建一个Runable接口的实现类
public class RunableImpl implements Runnable{
    //2重写Runable接口的run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }

    }
}
