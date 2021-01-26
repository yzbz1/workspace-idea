package cn.itcast.day09.demo02;
/*
    在父子类继承的关系中,如果成员变量重名,则创建子类对象时,访问有2种方式:
    1直接通过子类对象访问成员变量
        等号左边是谁,则优先用谁,没有则向上找
    2间接通过成员方法访问成员变量
        该方法属于谁就优先用谁

*/
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);


        System.out.println("==================");
        System.out.println(zi.num);    //ZI zi定义的所以这个zi是Zi 所以使用的是子类的num

        System.out.println("==================");
        zi.methodZi();

        zi.methodFu();
    }
}
