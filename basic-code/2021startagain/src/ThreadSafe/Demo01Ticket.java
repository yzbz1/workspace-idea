package ThreadSafe;
/*
    模拟卖票案例
    创建3个线程,同时开启.对共享的票进行出售
* */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
