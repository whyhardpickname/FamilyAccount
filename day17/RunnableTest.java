/**
 * @author MarkChern
 * 应用接口Runnable开启多线程
 * 1. 自定义类应用Thread。
 * 2.重写抽象方法run
 * 3.使用自定义类作Thread类构造器参数构造Thread类。
 * 3.在其它线程中使用Thread类启动start方法
 *
 * 为什么使用接口？
 * 因为java是单继承，使用接口Runnable的自定义类如有需要，可以继承其它类。
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程: " + i);
        }
    }
}
