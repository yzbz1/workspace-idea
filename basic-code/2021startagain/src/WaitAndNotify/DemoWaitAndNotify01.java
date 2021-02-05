package WaitAndNotify;
/*

 */
public class DemoWaitAndNotify01 {
    public static void main(String[] args) {
        //如果村在双方都需要操作的数据 int i = 0;
        //创建锁对象,保证唯一
        Object o = new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //保证等待和唤醒只有一个执行,需要使用同步技术
                    synchronized(o){
                        try {
                            System.out.println("消费者111:消费需求信息");
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //线程唤醒后执行
                        System.out.println("消费者111被唤醒后消费");
                        System.out.println("-----------------------------");
                    }
                }
            }
        }.start();
        //客户2
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //保证等待和唤醒只有一个执行,需要使用同步技术
                    synchronized(o){
                        try {
                            System.out.println("消费者222:消费需求信息");
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //线程唤醒后执行
                        System.out.println("消费者222被唤醒后消费");
                        System.out.println("-----------------------------");
                    }
                }
            }
        }.start();


        //生产者

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized(o){
                        try {
                            Thread.sleep(5000);//消耗5秒钟

                            System.out.println("完成工作");
                            //唤醒消费者线程
                            //o.notify();   //随机唤醒一个等待线程
                            o.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
               }
        }.start();





    }



}
