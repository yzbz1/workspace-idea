package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
    write 只能写入一个字节
    一次写入写多个字节的方法:
        write(byte[] b)
        write(byte[] b,int off,int len)
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象,构造方法中绑定要写入的数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\cache\\b.txt"));
        //使用write 方法,将数据写到文件当中  文件中写入100,写个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);
        /*
        使用 write(byte[] b) 一次写多个
        吐过写入的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
        如果写入的第一个字节是负数,那么第一个字节和第二个字节,2个字节组成一个中文显示查询系统默认表 GBK


        */
        byte[] btes = {65,66,67,68,69};   //如果第一个是负数{-65,-66,-67,68,69}
        fos.write(btes);

        //写入字节数组的一部分写入到文件中
        //write(byte[] b,int off,int len)  off:数组开始的索引,len写入的字节个数
        fos.write(btes,1,2);

        //写入字符串的方法:可以使用String类的中方法将字符串转换为字节数组
        // byte[] getBytes() 将字符串转换为数组
        /* 将字符写入到文件中 */
        byte[] bytes1 = "你好".getBytes();     //将字符串转换为字节
        System.out.println(Arrays.toString(bytes1));   //使用Arrays.toString()输出数组
        fos.write(bytes1);                    //写入字节到文件

        //关闭流
        fos.close();


    }
}
