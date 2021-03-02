package Recursion;

public class Demo01Recursion {
    public static void main(String[] args) {



        //a();
        b(1);
    }
/*
    构造方法禁止递归
        直接变异报错
 */
   /* public Demo01Recursion() {
        Demo01Recursion();
    }*/

    //递归的次数也不能太多,不然内存一样会溢出
    private static void b(int i) {
        System.out.println(i);
        if (i == 23941){
            return;   //结束方法
        }
        b(++i);
    }


    private static void a() {
        System.out.println("a方法!");
        a();    //会一直调用a方法,方法太多了,超出占内存就会导致内存溢出的错误

    }
}
