package homework.homework5v2;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

/**
 * @author MarkChern
 */
public class Tunnel implements Runnable{
    private int num;

    @Override
    public void run() {
        through();
    }

    public synchronized void through() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num++;
        System.out.println(Thread.currentThread().getName() + ", 第" + num + "个通过");
    }
}
