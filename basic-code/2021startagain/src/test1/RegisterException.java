package test1;

/**
 * 自定义异常类:
 *  java提供的异常类,除此之外,我们还可以自己定义异常类,继承Exception
 *  需要添加一个空参数的构造方法
 *  添加一个带异常信息的构造方法
 *  注意:
 *      1.自定义异常类 一般都是Exception结尾
 *      2.自定义异常类,必须的机场Exception或者RuntimeException
 *          继承Exception 就是编译期异常
 *          继承RuntimeException 就是运行期异常,无需处理交给虚拟机处理(中断处理)
 */
public class RegisterException extends Exception{
    //添加一个无参构造方法
    public RegisterException() {
    }
    /**
     * 添加一个带异常信息的构造方法
     * 产看源码发现,所有异常类都会有一个异常信息的构造方法,方法内部会调用父类的构造方法
     */

    public RegisterException(String message) {
        super(message);
    }
}
