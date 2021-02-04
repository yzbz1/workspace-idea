package test1;

import useMod.RunableImpl;

/*
    简化代码,将子类继承父类,重写父类的方法,创建子类对象 合一步完成
    把实现类实现类接口,重写接口中

 */
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"匿名内部类");
                }
            }
        }.start();

        //线程的接口Runnable
        Runnable r = new RunableImpl() {
            //重写run方法设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        };

        new Thread(r).start();

        //简化接口的方式
        new Thread(new RunableImpl(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"匿名直接传入接口"+i);
                }
            }
        }).start();


        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            System.out.println(Thread.currentThread().getName()+"创建接口对象"+i);
                        }
                    }
                }
        ).start();

    }

}
