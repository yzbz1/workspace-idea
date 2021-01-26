package cn.itcast.day08.demo01;


/*
* java.lang.String类代表字符类
*
*z
* 1.字符串是常量,
* 2.正是因为字符串不可改变,字符串可以共享使用
*
* 创建字符串的3+1种方式
*
* */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串是:"+str1);
        char[] charArray = {'K','T','M'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是:"+str2);

        byte[] byteArray = {97,98,108};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是:" + str3);

        String str4 = "ads";
        System.out.println("第三个字符串是:" + str4);


    }




}
