package cn.itcast.day08.demo02;
/*
String 当中与获取相关的常用方法有:

public int length():获取字符串当中含有的字符个数.拿到字符串长度
public String concat(String str): 将当前的字符串和参数字符拼接成为新的字符串
public char charAt(int index): 获取指定索引位置的单个字符
public int indexof(String str):  查找参数字符在字符串当中首次出现的索引位置


*/
public class Demo02StringGet {

    public static void main(String[] args) {
        //获取字符串的长度
        int length = "sdafasdsadssadasdsad".length();
        System.out.println("字符串长度是:" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("================");

        //获取指定索引位置的单个字符

        char ch = "Hello".charAt(1);
        System.out.println("在一号位置的字符是:"+ch);
        System.out.println("================");

        //查找参数字符串在字符串中出现的第一次索引位置
        //如果没有则返回-1

        String ori = "HelloWorld";
        int index = ori.indexOf("llo");
        System.out.println("第一次索引值是:"+index);
        System.out.println("HelloWorld中包含的abc位置在:"+"HelloWorld".indexOf("abc"));


        System.out.println("---------------------------------");
        System.out.println("String".length());
        System.out.println("Hello".concat("world"));
        System.out.println("HelloWorld".charAt(0));
        System.out.println("HelloWorld".indexOf("ld"));
    }
}
