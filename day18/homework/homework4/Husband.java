package homework.homework4;

/**
 * @author MarkChern
 */
public class Husband extends Thread{
    AccountManager accountManager;

    public Husband(String name, AccountManager accountManager) {
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
            accountManager.deposit();
        }
    }
}
