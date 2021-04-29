/**
 * @author MarkChern
 *
 * 使用继承Thread开启多线程
 * 1. 自定义类继承Thread。
 * 2.重写run
 * 3.在其它线程中先启动start方法
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程: " + i);
        }
    }
}

