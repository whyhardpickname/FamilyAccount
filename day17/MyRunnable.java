/**
 * @author MarkChern
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("自定义线程: " + i);
        }
    }
}
