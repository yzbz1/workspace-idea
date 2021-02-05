package Synchronized02static;
/*
    实现卖票案例
    第二种方案
    1 抽取共享的数据 放入方法中
    2使用synchronized修饰该方法
 */
public class RunnableImpl implements Runnable{
    //定以一个多线程共享的票源
    private static int ticket = 100;

    //创建一个锁对象
    Object obj =  new Object();

    //设置线程任务:卖票
    @Override
    public void run() {
        while(true){
            System.out.println("this:"+this);
            //调用使用synchronized修饰的方法

            payTicketStatic();

        }
        }


        //定义一个同步方法
    public static synchronized void payTicketStatic(){
        //判断票是否存在
        if (ticket > 0){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket --;
        }
    }
    }

