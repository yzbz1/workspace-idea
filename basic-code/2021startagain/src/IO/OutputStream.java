package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream:此抽象类表示输出字节流的多有超类.
    定义了一些子类共性的成员方法:


    写入(内存 -> 硬盘)
        java程序 --> jvm(java虚拟机) -->os ->调用写数据方法 ->把数据写到文件中

    字节输出流的使用步骤(重点):
        1.创建FileoutPutStream对象,构造方法中传入写入数据的目的地
        2.调用FileoutPutStream的write方法,把数据写入到文件中
        3.释放资源
 */
public class OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutStream对象,构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\cache\\a.txt");
        //2.调用FileoutPutStream的write方法,把数据写入到文件中(如果没有该文件会自动创建,文件中已有数据会被覆盖)
        fos.write(97);
        //3.释放资源
        fos.close();
    }

}
