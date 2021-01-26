package cn.itcast.day08.demo02;
/*
 public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值
 public byte[] getBytes(): 获取当前字符串底层的字节数组
 public String replace(CharSequence oldSting, CharSequence newString);
  将所有出现的老字符串替换为新的的字符串,返回替换之后的结果新字符串,字符串内容替换
  备注:CharSequence意思就是说可以接受字符串类型
  */
public class Demo04StringConvert {

    public static void main(String[] args) {
        char[] c1 = "Hello".toCharArray();
        System.out.println(c1[0]);
        System.out.println(c1.length);
        System.out.println("===============================");

        byte[] bytes = "World".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===============================");
        String  str1 = "How do u do";
        String o = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(o);

        System.out.println("===============================");
        String lang1 = "what fuck u doing ,guys?";
        String replace = lang1.replace("uc", "**");
        System.out.println(replace);


    }


}
