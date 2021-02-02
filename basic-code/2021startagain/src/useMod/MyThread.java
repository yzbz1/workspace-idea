package useMod;

/**
 * 获取线程的名称
 *  1.getName()  返回线程的名称
 *  2.获取当前正在执行的线程currentThread(),再使用getName获取线程名
 */
public class MyThread extends Thread{
    //重写Thread类的run方法,设置线程任务

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            //获取线程名称
            String name = getName();
            System.out.println(name);
            System.out.println("run"+i);
        }
    }
}
