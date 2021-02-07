package Lambda;

public class CookUse {
    public static void main(String[] args) {

        invokeCook(() -> {
            System.out.println("使用lambda实现接口的抽象方法");
        });
    }

    //定义一个方法,参数传递Cook接口,方法调用Cook接口中的方法  makeF

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }


}
