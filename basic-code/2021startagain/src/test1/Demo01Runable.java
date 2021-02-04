package test1;

import useMod.RunableImpl;

public class Demo01Runable  {
    public static void main(String[] args) {
        //创建一个Runnable接口的实现类对象
        RunableImpl run = new RunableImpl();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-something"+i);
        }
    }
}
