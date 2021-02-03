package useMod;
/*
    设置线程的名称:
        1.使用Thread 的setName方法
        2.创建一个带参数的构造方法,参数传递线程的名称,调用父类的带参构造方法,将线程名称传递给父类构造方法
 */
public class Mythread01 extends Thread{

    public Mythread01() {
    }

    public Mythread01(String name) {
        super(name);  //让父类Thread给子类线程起名
    }

    @Override
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
