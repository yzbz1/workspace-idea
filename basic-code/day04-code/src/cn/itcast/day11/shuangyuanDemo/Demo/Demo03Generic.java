package cn.itcast.day11.shuangyuanDemo.Demo;

//泛型
public class Demo03Generic {
    public static void main(String[] args)
    {
        GenericClass<String> gs = new GenericClass<>();
        gs.setName("1");

        String name = gs.getName();
        System.out.println(name);

    }

    public <M> void method01(M m){
        System.out.println(m);
    }
}



