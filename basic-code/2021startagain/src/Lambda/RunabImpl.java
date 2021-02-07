package Lambda;
/*
* 创建Runable接口的实现类,重写run方法
* */
public class RunabImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新建了线程");
    }
}
