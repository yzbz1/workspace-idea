package test1;

public class Demo03MyThread extends Thread{
    //重写run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }
}
