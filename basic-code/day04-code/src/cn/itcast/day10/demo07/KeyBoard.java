package cn.itcast.day10.demo07;
//键盘是一个USB设备
public class KeyBoard implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
}
