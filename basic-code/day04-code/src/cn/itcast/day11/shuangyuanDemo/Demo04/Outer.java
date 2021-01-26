package cn.itcast.day11.shuangyuanDemo.Demo04;

public class Outer {
        int j = 20;
    public class  Innerter {
        int j = 10;
        public void InMethod(){
            System.out.println("内部类方法");
            System.out.println(this.j);
            int x = Outer.this.j;
            class MetClass{

            }
        }
    }
    public void OutMethod(){
        System.out.println("外部类方法");
    }
}
