package cn.itcast.day08.demo02;
/*
*
* ==是进行对象的地址值比较,如果需要比较内容,可以使用2个方法:
* public boolean equals(Object obj)   参数可以是任何对象,只有参数是一个字符串并且内容相同时才会是true
* 备注:1任何对象都可以使用Object接受
*      2equals方法具有对称性,也就是 a.equals(b)和b.equals(a)效果相同
*      3比较的双方如果一个是常量,一个是变量  建议使用常量调用方法
*
* public boolean equalsIgnoreCase(String str)   //忽略大小写
*
* */
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);


        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        System.out.println("hello".equals(str1));
        System.out.println("=====================");


        String str5 = "abc";
        System.out.println("abc".equals(str5));
        System.out.println(str5.equals("abc"));  //不推荐   因为 str5可能是null  会报错NullpointerException

        String strA = "Hello";
        String strB = "hello";
        System.out.println("$$$$$$$$$$$$$$$$");
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));

        System.out.println();

    }
}
