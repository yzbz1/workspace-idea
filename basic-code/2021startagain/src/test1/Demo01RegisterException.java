package test1;
/*模拟注册操作,用户名已存在抛出异常*/

import java.util.Scanner;

/**
 * 1.数组存放已经存在的用户名(模拟数据库)
 * 2.使用sacnner输入注册信息
 * 3.定义判断方法  true 用户名存在  抛出异常输出提示信息
 *               false 用户不存在  继续
 *               循环结束还找不到  添加到数组  提示用户注册成功
 *
 */
public class Demo01RegisterException {
    static String[] usernames= {"张三","李四","王五"};


    public static void main(String[] args) throws RegisterException {
        //获取注册用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = sc.next();
        checkUsename(username);


    }

    public static void checkUsename(String username)  {
        for (String name : usernames) {
            if (name.equals(username)){
                //用户名存在,抛出异常
                try {
                    throw new RegisterException("该用户名已被注册!");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;    //结束方法
                }
            }
        }
        System.out.println("恭喜您注册成功!");

    }


}
