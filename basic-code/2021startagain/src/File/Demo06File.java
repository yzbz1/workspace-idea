package File;

import java.io.File;

/*
    遍历文件夹目录功能
    public String[] lsit()
    public File[] lsitFiles()
 */
public class Demo06File {
    public static void main(String[] args) {
        //show01();
        show02();

    }
/*
返回一个file类型的数组
 */
    private static void show02() {
        File f1 = new File("C:\\Users\\Administrator\\OneDrive\\workspace\\basic-code\\2021startagain\\src");
        File[] files = f1.listFiles();
        for (File f: files
             ) {
            System.out.println(f);  //调用toString方法
        }

    }





/*
    public String[] list() :返回一个Strieng数组,
    表示该File中有文件或者目录
 */

    private static void show01() {
        //遍历文件夹
        File f1 = new File("C:\\Users\\Administrator\\OneDrive\\workspace\\basic-code\\2021startagain\\src");
        String[] arr = f1.list();
        for (String filename : arr){
            System.out.println(filename);
        }


        System.out.println(
                "-----"
        );
        //如果遍历一个文件\或者遍历的路径不存在  返回一个空指针异常  可以遍历出windows 隐藏的文件/文件夹

        File f2 = new File("C:\\Users\\Administrator\\OneDrive\\workspace\\basic-code\\2021startagain\\src\\CeMain.java");
        String[] arr1 = f2.list();
        for (String filename : arr1){
            System.out.println(filename);
        }



    }

}
