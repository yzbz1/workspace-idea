package Lambda;
/*
* Lambda表达式有参数有返回值练习
* 需求:
*   给定一个计算器calculator接口,内含抽象方法calc
* */
public class CalculatorUse {
    public static void main(String[] args) {
        /*invokeCalc(5, 6,(a,b) -> {
            return a + b;
        });*/

        //使用Lambda省略优化
        invokeCalc(5, 6,(a,b) -> a + b);
    }

    private static void invokeCalc(int a,int b,Calculator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
    //定义一个方法,参数传递2个int在传递calculator


}
