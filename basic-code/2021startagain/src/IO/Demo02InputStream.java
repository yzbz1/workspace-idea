package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输入流
    一次读取多个字节的方法
    int read(byte[] b)
* */
public class Demo02InputStream {

    public static void main(String[] args) throws IOException {
        //创建输入流
        FileInputStream fis = new FileInputStream("basic-code\\2021startagain\\src\\IO\\a.txt");
       /* //使用read方法读取文件  int read(byte[] b)
        byte[] bytes = new byte[2];   //用来存放的数组
        int len = fis.read(bytes);
        System.out.println(len);
        //  System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        //释放资源
        fis.close();*/

        byte[] bytes = new byte[1024];  //存储读取到的多个字节
        int len =  0;   //记录读取到的有效字节个数
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }


        /*
            重复读取可以使用循环,不知道次数就使用while来循环

            */


    }

}
