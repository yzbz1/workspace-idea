package Recursion;

import java.io.File;

/*
  递归打印多级目录
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\前端相册展示");
        getAllFile(file);
    }
    //定义一个方法,参数传入File类型的目录,方法中对目录进行遍历
    public static void  getAllFile(File dir){
        System.out.println(dir);   //打印被遍历的文件夹名称
        File[] files = dir.listFiles();

        for (File f : files) {  //遍历文件夹内容
            //如果还是文件夹的话继续(遍历)
            if (f.isDirectory()){
                getAllFile(f);
            }else {
                //只是一个文件的话直接输出就行
                System.out.println(f);
            }



            System.out.println(f);
        }
    }


}
