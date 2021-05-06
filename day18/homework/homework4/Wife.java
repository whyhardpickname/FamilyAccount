package homework.homework4;

import com.sun.org.glassfish.external.amx.AMX;

/**
 * @author MarkChern
 */
public class Wife extends Thread{
    AccountManager accountManager;

    public Wife(String name, AccountManager accountManager) {
        super(name);
        this.accountManager = accountManager;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            accountManager.withdraw();
        }
    }
}
