package Recursion;
/*
    使用递归计算1-n之间的和
 */
public class Demo02Recurison {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }


    /*
        1+2+3+...+n
        ↓
        n+(n-1)+...1
        已知:
        最大值n
        最小值1
        使用递归的明确条件:
            1.递归的结束条件
                获取到1的时候结束
            2.递归的目的:
                获取下一个被加的数字(n-1)
     */
    public static  int sum(int n){
        //获取到1的时候结束
        if ( n == 1){
            return 1;
        }
        //获取下一个被加的数字(n-1)
        return  n + sum(n-1);
    }
}
