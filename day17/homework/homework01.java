package homework;

import java.util.Random;

/**
 * @author MarkChern
 */
public class homework01 {
    public static void main(String[] args) {
        PrintNumber printEven = new PrintNumber("偶数线程",0);
        PrintNumber printOdd = new PrintNumber("奇数线程",1);
        printEven.start();
        printOdd.start();
    }
}

class PrintNumber extends Thread{
    private final int parity;//0表示偶数，1表示奇数。

    public PrintNumber(String name, int parity) {
        super(name);
        this.parity = parity;
    }

    public void printOdd() {
        Random random = new Random();
        //生成1到100的奇数。2n + 1, n = 0, 1, ..., 49.
        System.out.println(getName() + (2 * random.nextInt(50) + 1));
    }

    public void printEven() {
        Random random = new Random();
        //生成1到100的偶数。2n + 2, n = 0, 1, ..., 49.
        System.out.println(getName() + (2 * random.nextInt(50) + 2));
    }

    @Override
    public void run() {
        if (parity % 2 == 0) {
            while (true) {
                printEven();
            }
        }
        else {
            while (true) {
                printOdd();
            }
        }
    }
}