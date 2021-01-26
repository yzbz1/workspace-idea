package cn.itcast.day08.demo02;
/*
     public String[] split(String regex):按照参数的规则,将字符串分成若干份
     注:split方法参数实际是一个正则表达式,如果要按照英文句号.则要写成\\.



*/
public class Demo05SringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        System.out.println("================");
        String str2 = "aaa bbb ccc";
        String[] split1 = str2.split(" ");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }

        String str3 = "xxx.yyy.zzz";
        String[] split2 = str3.split(".");
        System.out.println(split2.length);
        for (int i = 0; i < split2.length; i++) {
            System.out.println(split2[i]);
        }
        System.out.println("===================");

        String[] split3 = str3.split("\\.");
        for (int i = 0; i < split3.length; i++) {
            System.out.println(split3[i]);
        }
        System.out.println(split3.length);
    }
}
