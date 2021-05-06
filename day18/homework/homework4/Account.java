package homework.homework4;

/**
 * @author MarkChern
 */
public class Account {
    private String account;
    private double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "账户：" + account + ", 余额：" + balance;
    }
}
