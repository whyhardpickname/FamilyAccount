package test14;

/**
 * @author MarkChern
 *
 * 线程通信用来解决生产者和消费者问题。
 * 生产者，负责产生“数据”的线程
 * 消费者，负责消耗“数据”的线程
 *
 * 当共享区域数据消耗完，消费者需要等待生产者产生数据后才执行。
 * 当共享区域内存占用完，生产者需要等待消费者消耗数据后才执行。
 *
 * 生产者与消费者问题
 * 1.线程安全，需要同步
 * 2.内存有限，需要协作，线程通信
 *
 * Object类中有
 * 1。wait，必须由锁对象（线程的监控器对象）来调用。
 * 1。notify，必须由锁对象（线程的监控器对象）来调用。
 *
 * notify的作用是唤醒一个正在等待的线程，必须与wait是同一个锁对象
 * notifyAll唤醒所有正在等待的同一个监视器的线程，避免生产者与消费者同时处于等待。
 */
public class Test14 {
    public static void main(String[] args) {
        WorkBeach workBeach = new WorkBeach();
        Cook cook1 = new Cook("厨师1", workBeach);
        Cook cook2 = new Cook("厨师2", workBeach);
        Waiter waiter1 = new Waiter("服务员1", workBeach);
        Waiter waiter2 = new Waiter("服务员2", workBeach);
        cook1.start();
        cook2.start();
        waiter1.start();
        waiter2.start();
    }
}


class WorkBeach {
    private int counter; //菜品的数目
    private static final int max = 1; //菜品的最大数目

    public synchronized void put() {
        while (counter >= max) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter++;
        System.out.println(Thread.currentThread().getName() + "放了一盘菜，剩余" + counter);
        notifyAll();
    }

    public synchronized void take() {
        while (counter <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter--;
        System.out.println(Thread.currentThread().getName() + "取了一盘菜，剩余" + counter);
        notifyAll();
    }
}

class Cook extends Thread {
    private WorkBeach workBeach;

    public Cook(String name, WorkBeach workBeach) {
        super(name);
        this.workBeach = workBeach;
    }

    @Override
    public void run() {
        while (true) {
            workBeach.put();
        }
    }
}
class Waiter extends Thread {
    private WorkBeach workBeach;

    public Waiter(String name, WorkBeach workBeach) {
        super(name);
        this.workBeach = workBeach;
    }

    @Override
    public void run() {
        while (true) {
            workBeach.take();
        }
    }
}