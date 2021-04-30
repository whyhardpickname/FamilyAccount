package homework;

import java.util.Random;

/**
 * @author MarkChern
 */
public class homework01 {
}

class PrintNumber {
    private final int parity;//0表示偶数，1表示奇数。

    public PrintNumber(int parity) {
        this.parity = parity;
    }

    public void printOdd() {
        Random random = new Random();
        System.out.println(2 * random.nextInt(50) + 1);//生成1到100的奇数。2n + 1, n = 0, 1, ..., 49.
    }

    public void printEven() {
        Random random = new Random();
        System.out.println(2 * random.nextInt(50) + 2);//生成1到100的偶数。2n + 2, n = 0, 1, ..., 49.
    }
}