package Filter.Impl;

import java.io.File;
import java.io.FileFilter;

/*
    创建过滤器FileFilter的实现类,重新过滤方法accept,定义过滤规则
 */
public class FileFinlterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
/*
        过滤规则
        判断File对象是否以.java结尾
        是就返回true
        不是就返回false
*/
        //如果pathname返回的是一个文件夹,也返回true,继续遍历这个文件夹
        if (pathname.isDirectory()){
            return true;
        }


        return pathname.getName().toLowerCase().endsWith(".java");

    }
}
