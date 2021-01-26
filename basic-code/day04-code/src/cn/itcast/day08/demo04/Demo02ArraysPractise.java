package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
* 将随机字符串  升序排序,反序打印
* */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "asd76sfxzvfagzxc";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
