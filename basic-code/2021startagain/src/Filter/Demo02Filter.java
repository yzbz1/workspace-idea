package Filter;

import Filter.Impl.FileFinlterImpl;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
    遍历 C:\Users\Administrator\Desktop\cache文件夹,以及文件夹的子文件夹
    只要.java类型
    使用过滤器来实现
    File类中有2个和listFiles重载的方法,方法的参数传递的就是过滤器

 */


/*
    简化Demo01Filter的方法不单独写实现类
* */
public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\cache");
        getAllFile(file);
    }
    //定义一个方法,参数传入File类型的目录,方法中对目录进行遍历
    public static void  getAllFile(File dir){
/*        第一种实现方法 对于listFiles 传入参数FileFilter
        //传入的实现类会用匿名内部类
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {     //实现accept的方法,实现规则
                //过滤规则,pathname是文件夹或者是.java文件
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });  //传递过滤器对象
*/
        //第二种方法 对于listFiles传入参数FilenameFilter 传入参数
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //进行一步转化将地址和文件组合一起(方法传入参数是分开的)
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });



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


