package File;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
        public boolean isDirectory() : 判断当前路径是否为目录
        public boolean isFile() :    判断当前路径是否为文件
        电脑中的路径要么是文件,要么是文件夹
        所以这2个方法是互斥的!
        使用前提:路径必须是存在的  否则都返回false

     */
    private static void show02() {
        File f1 = new File("C:\\Users\\Administrator\\OneDrive\\workspace\\basic-code1\\2021startagain");
        File f2 = new File("C:\\Users\\Administrator\\OneDrive\\workspace\\basic-code\\2021startagain");
        File f3 = new File("workspace.iml");

        ifEM(f1);
        ifEM(f2);
        ifEM(f3);


    }

    public static  void ifEM(File f1){
        if (f1.exists()){
            if (f1.isDirectory()){
                System.out.println("该路径为文件夹");
            }else{
                System.out.println("该路径为文件");
            }
        }else{
            System.out.println("输入的路径地址不存在");
        }
    }


    /**
     * public boolean exists() :  判断File表示的文件或者目录是否存在
     */

    private static void show01() {
        File f1 = new File("C:\\Users\\Administrator\\OneDrive\\workspace\\basic-code\\2021startagain");
        System.out.println(f1.exists());   //说明路径是存在的

        File f2 = new File("C:\\Bsers\\Administrator\\OneDrive\\workspace\\basic-code\\2021startagain");
        System.out.println(f2.exists());  //false 地址不是真实存在的
        //相对路径
        File f3 = new File("workspace.iml");   //相对路径  相对当前路径的根目录
        System.out.println(f3.exists());


        File f4 = new File("a.iml");
        System.out.println(f4.exists());



    }
}
