package test1;
/**
 * 如果finally有return 语句,永远返回finally中的结果,避免该情况
 * 解决方法 不要在finally里写return -_-||
 */
public class Demo02Exception {
    public static void main(String[] args){
        int a = getA();
        System.out.println("a:"+a);
    }

    private static int getA() {
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally{
            a = 100;
            return a;     //一定会执行的代码
        }




    }

    //定义一个方法,返回变量a的值


}
