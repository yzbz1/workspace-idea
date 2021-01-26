package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();  //创建一个笔记本电脑

        computer.powerOn();

        //准备一个鼠标供电脑使用
        //Mouse mouse = new Mouse();
        //实现规范，满足USB接口  向上转型
        USB mouseusb = new Mouse();
        //参数是usb类型，传递usb鼠标
        computer.usbDevice(mouseusb);
        //创建一个usb键盘
        KeyBoard keyBoard = new KeyBoard();    //没有用多态方法
        computer.usbDevice(keyBoard);          //参数类型是USB，传进去的是实现类对象  正确？因为本身就是USB接口的实现子类——>所以自动向上转型

        computer.powerOff();
    }
}
