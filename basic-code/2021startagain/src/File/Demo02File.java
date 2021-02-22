package File;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
    /*
    File类的构造方法
    */
        File f1 = new File("H:\\OneDriveCache\\OneDrive - ahqb\\学习\\a.txt");
        System.out.println(f1);   //重写了toString方法

        File f2 = new File("H:\\OneDriveCache\\OneDrive - ahqb\\学习");
        System.out.println(f2);


        File f3 = new File("b.txt");
        System.out.println(f3);

        //第二种方式
        // new File("父路径","子路径")

        show01("c:\\","a.txt");
        show03();



    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);
    }

    private static void show01(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }
}
