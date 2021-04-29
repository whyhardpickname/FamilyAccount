package test11;

/**
 * @author MarkChern
 * 同步方法的语法格式：
 * 修饰符 synchronized 返回值 方法名（形参类表）
 *
 * 同步方法的锁对象自动选择
 * 1.非静态方法：this
 * 2.静态方法：this的class对象
 *
 */
public class Test10 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("窗口1");
        Ticket t2 = new Ticket("窗口2");
        Ticket t3 = new Ticket("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket extends Thread {
    private static int total = 100;

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (total > 0 ) {
            saleOneTicket();
        }
    }
    public static synchronized void saleOneTicket() {
        if (total> 0) {
            System.out.println(Thread.currentThread().getName() + "卖出一张票");
            total--;
            System.out.println("剩余" + total + "张");
        }
    }
}