package Filter;

import java.io.File;
import java.io.FilenameFilter;




/*
    简化Demo02Filter的方法
    实现接口的方法使用lambda
* */
public class Demo02FilterChangeToLambda {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\cache");
        getAllFile(file);
    }
    //定义一个方法,参数传入File类型的目录,方法中对目录进行遍历
    public static void  getAllFile(File dir){

        //第一种方法的lambda实现
       File[] files = dir.listFiles(dir2 ->  dir2.isDirectory() || dir2.getName().toLowerCase().endsWith(".java"));

       //第二种方法的lambda表达式实现方式
       // File[] files = dir.listFiles((dir1,name) ->  new File(dir1,name).isDirectory() || name.toLowerCase().endsWith(".java"));






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


