package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    练习:文件复制(一读一写)


 */
public class Demo07FIleCopyTest {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1.创建一个字节输入流,构造方法中指定要读取的文件位置
        FileInputStream fis = new FileInputStream("H:\\OneDriveCache\\OneDrive\\Pictures\\INS\\151694259_153984893225224_7032572839086704122_n.jpg");
        //2.创建一个字节输出流,构造方法中指定需要写入的目的地
        FileOutputStream fos = new FileOutputStream("E:\\CopyTestFIle\\1.jpg");
        //方法1--使用一次读一个字节,写一个字节的方式实现\
       /* int len = 0;
        while ((len = fis.read()) != -1){
            //字节写入
            fos.write(len);
        }*/

        //方法2--使用数组进行缓冲,读入多个字节写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            //写入数组里的多个字节
            fos.write(bytes,0,len);
        }


        //释放资源,先关闭写入流
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("共耗时"+(e-s)+"毫秒");
    }
}
