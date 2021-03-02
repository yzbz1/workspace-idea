package Recursion;
/*
    练习:
        使用递归计算阶乘


 */
public class Demo03Recursion {
    public static void main(String[] args) {
        int jc = jc(5);
        System.out.println(jc);
    }
    /*
        定义一个阶乘

        递归的目的获取下一个阶乘的数字n-1
     */

    public static int jc(int n){
        //递归结束的条件
        if (n == 1){
            return 1;
        }
        //获取下一个被乘的数字
        return n * jc(n -1);

    }


}
