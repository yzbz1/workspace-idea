package Recursion;

import java.io.File;
import java.util.Locale;

/*
  递归打印多级目录2
  只输出指定类型的文件(比如.java文件)
 */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator.DESKTOP-704REEK\\Desktop\\待办\\前端相册展示");
        getAllFile(file);
    }
    //定义一个方法,参数传入File类型的目录,方法中对目录进行遍历
    public static void  getAllFile(File dir){
        File[] files = dir.listFiles();

        for (File f : files) {  //遍历文件夹内容
            //如果还是文件夹的话继续(遍历)
            if (f.isDirectory()){
                getAllFile(f);
            }else {

                //1将file对象转换为字符串对象
                String name = f.getName();

                name = name.toLowerCase();    //将所有字符全部转换为小写
                //2调用String类中的endwith判断字符串是否以.js结尾
                boolean b = name.endsWith(".js");
                //如果是.js结尾则输出
                if (b){
                    System.out.println(f);
                }



            }




        }
    }


}
