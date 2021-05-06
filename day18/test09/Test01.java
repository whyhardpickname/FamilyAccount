package test09;

/**
 * @author MarkChern
 * 线程安全
 * 举例：买票
 * 假设有n张票，分三个窗口卖。
 *
 * 当多个线程使用“共享数据“时，某个线程修改共享数据，会影响其它线程。
 *
 * 如何解决？
 * 加锁。
 *
 * 形式一：同步代码块
 * 形式二：同步方法
 * synchronized(锁对象){
 *     //代码块
 * }
 *
 * 锁对象，又叫监控对象。同一时间，某一段代码只允许一个线程运行。锁对象记录该线程，并阻止其它线程进入。
 *
 * 锁对象的选择
 * 1.任意对象
 * 2.必须是线程共享的对象
 *
 * 加锁范围：
 * 1. 太大，某线程霸占
 * 2. 太小，线程互相干扰
 */
public class Test01 {
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
    private static Object lock = new Object();

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            synchronized(lock) {
                if (total> 0) {
                    System.out.println(getName() + "卖出一张票");
                    total--;
                    System.out.println("剩余" + total + "张");
                }
                else {
                    break;
                }
            }
        }
    }
}
