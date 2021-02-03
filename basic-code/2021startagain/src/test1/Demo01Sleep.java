package test1;

public class Demo01Sleep {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            //使用Thread类的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
