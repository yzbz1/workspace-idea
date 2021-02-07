package Lambda;
/*
    Lambda表达式的标准格式
        由三部分组成
        1.一个参数
        2.一个箭头
        3.一段代码
      格式:
      (参数列表) -> {重写方法的代码}
      解释说明格式:
      ():接口中抽象发放的参数类别,没有参数就空着,多个参数","分割
      ->:传递的意思,把参数传递给方法体
      {}:重写接口的方法体
      ??? 接口如果存在多个抽象方法呢?


 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"匿名内部类创建线程");
            }
        }).start();

        //使用lambda表达式优化写法,实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"使用lambda");
        }
        ).start();

        //再次优化,可省略的省略
            //1.同时省略了方法体的 {} ;
        new Thread(() -> System.out.println(Thread.currentThread().getName()+"使用lambda省略")).start();



    }
}
