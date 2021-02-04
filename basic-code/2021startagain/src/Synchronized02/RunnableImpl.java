package Synchronized02;
/*
    实现卖票案例
    ThreadSafe包里面的卖票,卖出了不存在的票和重复的票

    此处解决线程安全问题
    1 使用同步代码块
 */
public class RunnableImpl implements Runnable{
    //定以一个多线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj =  new Object();

    //设置线程任务:卖票
    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized(obj){
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
        }
    }

