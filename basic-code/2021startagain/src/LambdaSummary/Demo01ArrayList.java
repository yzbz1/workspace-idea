package LambdaSummary;

import java.util.ArrayList;

/*
    Lambda表达式:是可推倒,可省略的
    凡是上下文能够推倒出来的内容,都可以省略
        1.(参数列表):括号中参数列表的数据类型,可以省略不写
        2.(参数列表):括号的参数如果只有一个,那么类型和括号都可以不写
        3.(一些代码):如果{}中的代码只有一行,无论是否有返回值,都可以省略 {} 和 return 和 分号
            注意:要省略就必须一起省略
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //jdk 1.7之前 创建集合对象必须前后泛型都写上
        ArrayList<String> list = new ArrayList<String>();  //JDK1.7之前
        //↓↓↓↓↓↓
        ArrayList<String> list1 = new ArrayList<>();  //JDK1.7之后 后面泛型可以不写





    }
}
