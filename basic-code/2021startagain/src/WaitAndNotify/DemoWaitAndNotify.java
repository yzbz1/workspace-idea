package WaitAndNotify;
/*
    等待唤醒案列:线程之间的通信
        创建一个顾客线程(消费者);直接进入wait需要生产者的唤醒(无限等待)
        创建一个生产者线程(生产者);执行操作,得出结果后换新消费者线程
        生产者和消费者必须使用同步代码块包裹,保证等待和唤醒只能有一个在执行
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用wait和notify方法
 */
public class DemoWaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象,保证唯一
        Object o = new Object();
        //创建顾客线程
         new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒只有一个执行,需要使用同步技术
                synchronized(o){
                    System.out.println("消费需求信息");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

         new Thread(){
             @Override
             public void run() {

                 try {
                     Thread.sleep(5000);//消耗5秒钟

                     System.out.println("完成");
                     o.notify();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }.start();
    }



}
