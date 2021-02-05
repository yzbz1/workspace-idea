package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例

    解决线程安全的第三种方法
    Lock锁
    lock接口的方法
    lock()  获取锁 (可能发生线程安全地方之前)
    unlock()  释放锁  (可能发生线程安全地方之后)
 */
public class RunnableImpl implements Runnable{
    //定以一个多线程共享的票源
    private int ticket = 100;
    //设置线程任务:卖票
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            //可能出现线程安全问题的地方上锁
            l.lock();
            //判断票是否存在
            if (ticket > 0){

                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket --;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    l.unlock();
                }
                //将释放锁放到finally里,无论是否发生异常,都会释放锁

            }


        }
        }
    }

