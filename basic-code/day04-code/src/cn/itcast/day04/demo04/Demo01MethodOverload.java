package cn.itcast.day04.demo04;
/*多个方法的名称一样,方法的参数不一样 */
public class Demo01MethodOverload {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
    public static int sum(int a, int b) {
        System.out.println("2参的方法");
        return a + b;
    }

    public static int sum(int a, int b,int c) {
        System.out.println("3参的方法");
        return a + b + c;
    }


}
