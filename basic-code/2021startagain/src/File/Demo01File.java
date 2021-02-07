package File;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;    //路径分隔符  win是; linux 是:
        String separator = File.separator;            //文件名称分隔符  win是\ linux 是/

        System.out.println(pathSeparator);
        System.out.println(separator);
    }
}
