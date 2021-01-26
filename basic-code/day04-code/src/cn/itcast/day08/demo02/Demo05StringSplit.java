package cn.itcast.day08.demo02;

/*
    定义一个方法,把数组{1,2,3按照指定格式拼接成一个字符串. 格式: [word1#word2#word3]}
    1.int[] 数组
    2.定义一个方法将数组变为字符串
    3.
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        int[] s1 = {1,2,3,4};

        String s = forArrayString(s1);
        System.out.println(s);

    }


    public static String forArrayString(int[] array){
        String cn = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length -1){
                cn += "word" + array[i] + "]";
            }else{
                cn += "word" + array[i] + "#";
            }

        }
        return cn;
    }
}
