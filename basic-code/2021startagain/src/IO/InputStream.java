package IO;
/*
    java.io.InputStream:字节输入流
    此抽象类表示字节输入流的所有超类

    定义了所有子类共性的方法
 */

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        //创建文件读取流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\cache\\a.txt");
        //使用read方法读取
        /*int len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();   //读取到最后一位时返回-1
        System.out.println(len);*/

        //↑↑↑以上读取过程是一个重复的过程,使用循环读取

        /*
            (len = fis.read()) != -1
            1.fis.read()读取一个字节
            2.len = fis.read() 将读取的字节赋值给len
            3.(len = fis.read()) != -1 判断变量len 是否不等于-1

         */
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.print((char) len);

        }


        while( fis.read() != -1){       //判断的时候读取一位,往后移动一次
            System.out.print(fis.read());//输出的时候读取一次,往后移动一次  ×
        }



        //释放资源
        fis.close();
    }

}
