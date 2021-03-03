package Filter;

import Filter.Impl.FileFinlterImpl;

import java.io.File;

/*
    遍历 C:\Users\Administrator\Desktop\cache文件夹,以及文件夹的子文件夹
    只要.java类型
    使用过滤器来实现
    File类中有2个和listFiles重载的方法,方法的参数传递的就是过滤器

 */
public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\cache");
        getAllFile(file);
    }
    //定义一个方法,参数传入File类型的目录,方法中对目录进行遍历
    public static void  getAllFile(File dir){

        File[] files = dir.listFiles(new FileFinlterImpl());  //传递过滤器对象

        for (File f : files) {  //遍历文件夹内容
            //如果还是文件夹的话继续(遍历)
            if (f.isDirectory()){
                getAllFile(f);
            }else {
                //只是一个文件的话直接输出就行
                System.out.println(f);
            }

        }
    }


}


