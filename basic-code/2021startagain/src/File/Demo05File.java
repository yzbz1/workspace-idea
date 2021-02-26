package File;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Desktop\\cache\\新建文件夹.txt");
        //System.out.println(f.mkdir());

        boolean b = f.delete();
        System.out.println(b);


    }
}