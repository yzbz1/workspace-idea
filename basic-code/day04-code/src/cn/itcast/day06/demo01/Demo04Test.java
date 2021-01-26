package cn.itcast.day06.demo01;

public class Demo04Test {

    public static void main(String[] args) {

                Phone one = new Phone();
                one.brand = "苹果";
                one.price = 2222.2;
                one.color = "黑色";
                method(one);

            }

            public static void method(Phone param){
                System.out.println(param.brand);
                System.out.println(param.color);
            }

}
