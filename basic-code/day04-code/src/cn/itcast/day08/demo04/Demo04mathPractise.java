package cn.itcast.day08.demo04;

//-10.8 到 5.9之间,绝对值大于6或者小于2.1的整数有多少
public class Demo04mathPractise {

    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;

        for (double i = Math.ceil(min) ; i < max ; i++){
            double abs = Math.abs(i);   //绝对值
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }

        System.out.println("总共有: " +  count);
    }
}
