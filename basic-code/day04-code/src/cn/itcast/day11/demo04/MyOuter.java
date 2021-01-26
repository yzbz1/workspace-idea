package cn.itcast.day11.demo04;
/*
局部内部类,如果希望访问所在方法的局部变量,那么这个局部变量必须是【有效final】的

* */
public class MyOuter {
    public void methodOuter() {
        int num = 10;


        class MyInner {
            public  void methodInner(){
                System.out.println(num);
            }
        }

    }
}
