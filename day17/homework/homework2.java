package homework;

/**
 * @author MarkChern
 */
public class homework2 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println(getName() + i);
                }
            }
        }.start();

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
