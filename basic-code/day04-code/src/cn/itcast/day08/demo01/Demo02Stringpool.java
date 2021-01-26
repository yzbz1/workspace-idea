package cn.itcast.day08.demo01;
/*
* 程序中直接双引号写上的字符串才在常量池当中。
* 对于基本类型来说 ： ==是进行数值的比较
*
*
* */
public class Demo02Stringpool {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

    }
}
