package cn.itcast.day04.demo03;

public class Demo04MethodNotice {
    public static void main(String[] args) {

    }

    public static int method(){
        return 10;
    }
    public static void  method2(){
        return; //没有返回值 只是结束执行方法
    }
    public static void method3(){
        //void最后一行的return可以不写,此return只起到停止作用
    }

    public static int getMax(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }


    }


}
