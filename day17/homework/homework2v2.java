package homework;

import java.util.Random;

/**
 * @author MarkChern
 */
public class homework2v2 {
    public static void main(String[] args) {
        PrintOdd printOdd = new PrintOdd();
        PrintEven printEven = new PrintEven();
        printOdd.start();
        printEven.start();
    }
}

class PrintOdd extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Thread.class) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("奇数线程第" + i + "个：" + (2 * i - 1));
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class PrintEven extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Thread.class) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("偶数线程第" + i + "个：" + (2 * i));
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}