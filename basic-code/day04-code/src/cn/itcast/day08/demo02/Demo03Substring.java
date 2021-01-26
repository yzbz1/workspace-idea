package cn.itcast.day08.demo02;

/*
public String substring(int index):截取从参数位置一直到字符串末尾,返回新的字符串
public String substring(int begin, int end):截取一个范围从begin开始到end结束中间的字符串
备注:[begin,end),包含左边,不包含右边
*/
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "Demo03Substring";
        String s = str1.substring(9);
        String BE = str1.substring(6,9);
        System.out.println(str1);
        System.out.println(s);
        System.out.println(BE);

        System.out.println("=================");
        String str2 = "Hello";
        System.out.println(str2);
        str2 = "java";
        System.out.println(str2);


    }
}
