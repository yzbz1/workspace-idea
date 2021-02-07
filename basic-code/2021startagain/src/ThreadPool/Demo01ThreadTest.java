package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池测试类
 * 线程池:jdk1.5之后提供
 * java.util.concurrent.Executors:线程池的工程类,用来生产线程池
 * Executors类中的静态方法
 * static ExecutorService newFixedThreadPool(int nThreads)
 * 创建一个可重用的固定线程的线程池
 * 参数:线程的个数
 * 返回值:返回的是ExecutorService接口的实现类对象,可以使用接口接收
 */
public class Demo01ThreadTest {
    public static void main(String[] args) {
        //1.创建线程池工厂类
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3.调用ExecutorService中的方法submit,传递线程任务,开启线程
        //线程池会一直开启  ,用完了会自动归还线程给线程池,可以继续使用
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());
        es.submit(new RunableImpl());

        es.shutdown();   //销毁线程池

        es.submit(new RunableImpl()); //抛出异常,因为线程池已销毁,就不能获取线程了


    }
}
