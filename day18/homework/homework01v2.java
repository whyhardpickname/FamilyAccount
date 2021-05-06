package homework;

import javax.swing.plaf.SliderUI;

/**
 * @author MarkChern
 */
public class homework01v2 {
    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 10) {
                    synchronized (homework2.class) {
                        for (int j = 0; j < 5; j++) {
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("奇数线程：" + (i + j * 2));
                        }
                    }
                }
            }
        }.start();

        for (int i = 2; i <= 100; i += 10) {
            synchronized (homework2.class) {
                for (int j = 0; j < 5; j ++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("偶数线程：" + (i + j * 2));
                }
            }
        }
    }
}
