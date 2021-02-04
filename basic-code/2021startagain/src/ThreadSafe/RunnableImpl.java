package ThreadSafe;
/*
    实现卖票案例
 */
public class RunnableImpl implements Runnable{
    //定以一个多线程共享的票源
    private int ticket = 100;
    //设置线程任务:卖票
    @Override
    public void run() {
        while(true){

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

