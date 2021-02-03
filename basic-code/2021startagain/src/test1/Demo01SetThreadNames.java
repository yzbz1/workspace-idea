package test1;

import useMod.Mythread01;

public class Demo01SetThreadNames {
    public static void main(String[] args) {
        Mythread01 mt = new Mythread01();
        mt.setName("小强");
        mt.start();


        Mythread01 mt1 = new Mythread01("老强");
        mt1.start();
/*
    sleep(); 是当前正在执行的线程以指定的毫秒数暂停
 */



    }
}
