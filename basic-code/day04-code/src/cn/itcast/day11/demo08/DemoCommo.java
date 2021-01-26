package cn.itcast.day11.demo08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DemoCommo {

    public static void main(String[] args) throws ParseException {
        /*demo01();
        demo02();
        demo03();
        demo04();
        demo05();
        //计算一个人吧已经出生了多少天
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式yyyy-MM-dd");
        String birthday = sc.next();
        //解析日期
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = s.parse(birthday);
        long birthdaytime = birthdayDate.getTime();
        long today = new Date().getTime();
        //计算差值
        long time = today - birthdaytime ;
        System.out.println(time/1000/3600/24/365);*/
        System.out.println("224--------------");
        Calendar c = Calendar.getInstance();   //父类接受子类对象
        System.out.println(c);
        demo06();
        demo07();

    }

    private static void demo07() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,9999);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    private static void demo06() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int mouth = c.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(mouth);
    }

    private static void demo05() throws ParseException {
        //将文本解析为日期，要符合构造方法中的模式的文本，不符合个就会抛出异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日,HH时mm分ss秒");
        Date date = sdf.parse("2020年08月19日,02时25分10秒");
        System.out.println(date);

    }

    private static void demo04() {
        //创建对象，并指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日,HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);

    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }


    private static void demo01() {

        Date date  = new Date();
        System.out.println(date);
    }

    private static void demo02() {   //毫秒值转换为日期
        Date date = new Date(0l);
        System.out.println(date);

    }


}
