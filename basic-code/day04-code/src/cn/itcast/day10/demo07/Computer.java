package cn.itcast.day10.demo07;

import org.w3c.dom.ls.LSOutput;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }
    //使用usb设别的方法,使用接口作为参数
    public void usbDevice(USB usb){
        usb.open();//打开设备

        if (usb instanceof Mouse){
            ((Mouse) usb).click();
        }


        if (usb instanceof KeyBoard){
            ((KeyBoard) usb).type();
        }




        usb.close();//关闭设备
    }
}
