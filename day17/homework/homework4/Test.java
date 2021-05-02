package homework.homework4;

/**
 * @author MarkChern
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account("0001", 0);
        AccountManager accountManager = new AccountManager(account);
        Husband husband = new Husband("小明", accountManager);
        Wife wife = new Wife("小红", accountManager);
        husband.start();
        wife.start();
    }
}
