package File;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    private static void show04() {
        //文件夹没有大小概念,如果构造方法给出的路径不存在,则Length方法返回0
        File f1 = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\1238200_527721307297253_1739087252_n.jpg");
        File f2 = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\b.txt");
        File f3 = new File("E:\\黑马Ee2020`````````````````````````````");
        long l1 = f1.length();
        System.out.println(l1);    //正常文件大小
        System.out.println(f2.length());      //b.txt"不存在返回0"
        System.out.println(f3.length());        //文件夹没有大小,返回4096
    }

    private static void show03() {
        File f1 = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\a.txt");
        System.out.println(f1.getName());

        File f2 = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办");
        System.out.println(f2.getName());

    }

    private static void show02() {
        File f1 = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\a.txt");
        File f2 = new File("a.txt");

        System.out.println(f1.getPath());
        System.out.println(f2.getPath());

    }

    private static void show01() {
        File f1 = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);
        System.out.println(new File("a.txt").getAbsolutePath());
    }
}
