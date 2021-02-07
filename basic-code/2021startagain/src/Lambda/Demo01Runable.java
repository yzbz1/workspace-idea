package Lambda;

/**
    使用实现Runable接口的方式实现多线程


 */
public class Demo01Runable {
    public static void main(String[] args) {
        //创建Runable实现类的对象
        RunabImpl run = new RunabImpl();
        //创建Thread类对象
        Thread t = new Thread(run);
        //启动线程,执行run方法
        t.start();

        //简化 使用匿名内部类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"匿名内部类创建线程");
            }
        }).start();
        //代码冗余,其实最核心的就是run的方法体才是最核心的,其他都是重复冗余工作
        //run( 主体 ){};



    }
}
