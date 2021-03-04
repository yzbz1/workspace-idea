package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加/续写:使用2个参数的构造方法
        FileOutputStream(String name,boolean append)  //创建一个具有指向性name的文件中写入数据的输出标志
        FileOutputStream(File nafileme,boolean append)  //创建一个指定File对象百世的文件中写入数据的文件输出流
        参数:
            String name,File file:写入数据的目的地
            Boolean append:追加写开关
                true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
                false:创建一个新文件覆盖原来文件,再写入数据

            写入换行:
                windows : \r\n
                Linux   : /n
                mac     : /r

*/
public class Demo03OutoutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\cache\\c.txt",true);

        for (int i = 1; i <= 10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        

        fos.close();
    }

}
