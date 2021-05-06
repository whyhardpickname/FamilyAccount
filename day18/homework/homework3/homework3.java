package homework.homework3;

/**
 * @author MarkChern
 */
public class homework3 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
    }
}

class PrintNum {
    private static int num = 1;

    public static synchronized void print() {
        PrintNum.class.notify();
        System.out.println(Thread.currentThread().getName() + ": " + num++);
        try {
            PrintNum.class.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            PrintNum.print();
        }
    }
}