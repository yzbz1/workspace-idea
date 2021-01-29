package useMod;
/*子父类的异常
    1.子类重写父类方法时,抛出和父类相同的异常或者都不抛出
    2.
    注意:子类异常要与父类异常一致
* */
public class Fu {
    public static void main(String[] args) {
        System.out.println("test");

        Zi zi = new Zi();
        zi.show04();
    }




    public void show01() throws NullPointerException,ClassCastException{}

    public void show02() throws IndexOutOfBoundsException{}

    public void show03() throws IndexOutOfBoundsException{}

    public void show04() {}

}

class Zi extends Fu{
    //子类重写父类方法
    public void show01() throws NullPointerException,ClassCastException{}
    //子类重写父类方法,抛出父类异常的子类  ArrayIndexOutOfBoundsException 为 IndexOutOfBoundsException的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法,父类虽然抛出异常,但是子类可以不抛出异常
    public void show03(){}
    //子类重写父类方法,父类没有抛出异常,子类重写父类方法时也不能抛出异常 ???  ->父类没有声明异常,子类就不能申明 只能trycatch处理
    public void show04() throws IndexOutOfBoundsException{
        System.out.println(
                "父类没有抛出异常子类缺可以抛出  why?"
        );
    }
}