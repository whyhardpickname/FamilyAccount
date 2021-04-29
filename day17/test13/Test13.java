package test13;

/**
 * @author MarkChern
 * 死锁：线程互相持有对方想要的锁,导致程序卡住。
 */
public class Test13 {
    public static void main(String[] args) {
        Object girl = new Object();
        Object money = new Object();
        Boy boy = new Boy(girl, money);
        Bang bang = new Bang(girl, money);
        bang.start();
        boy.start();
    }
}

class Boy extends Thread {
    private Object girl;
    private Object money;

    public Boy(Object girl, Object money) {
        this.girl = girl;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (money) {
            System.out.println("同意给钱");
            synchronized (girl) {
                System.out.println("给钱");
            }
        }
    }
}


class Bang extends Thread {
    private Object girl;
    private Object money;

    public Bang(Object girl, Object money) {
        this.girl = girl;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized (girl) {
            System.out.println("要钱");
            synchronized (money) {
                System.out.println("放人");
            }
        }
    }
}