package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
 键盘输入一个字符串,并且统计其中各种字符出现的次数
  种类有:大写字母 小写字母 数字  其他

 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();  //获取键盘输入的字符串

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countother = 0;

        char[] charsArray = s.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            char ch = charsArray[i];
            if ('A'<=ch && ch <='Z') {
                countUpper++;
            }else if('a'<=ch && ch <='z'){
                countLower++;
            }else if('0'<=ch && ch <='9'){
                countNumber++;
            }else{
                countother++;
            }
        }

        System.out.println("大写字母数目:" + countUpper);
        System.out.println("小写字母数目:"  + countLower);
        System.out.println("数字字符数目:"  + countNumber);
        System.out.println("其他字符数目:"  + countother);

    }
}
