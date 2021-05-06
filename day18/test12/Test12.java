package test12;

/**
 * @author MarkChern
 */
public class Test12 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    private int total = 100;

    @Override
    public void run() {
        while (total > 0) {
            saleOneTicket();
        }
    }

    private synchronized void saleOneTicket() {
        if (total> 0) {
            System.out.println(Thread.currentThread().getName() + "卖出一张票");
            total--;
            System.out.println("剩余" + total + "张");
        }
    }
}