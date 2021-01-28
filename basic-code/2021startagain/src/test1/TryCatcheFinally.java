package test1;
/*finally代码块*/
//finally代码块接在catche 后面无论是否出现异常都会执行
/*
    1.finally不能单独使用 必须和catche一起
    2.finally一般用来程序释放,无论是否异常最后都要释放(IO)

* */

import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatcheFinally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            System.out.println("资源释放");
        }
    }



    private static void readFile(@NotNull String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        /*传入的文件类型不对  抛出异常*/
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件格式不正确");
        }
    }
}
