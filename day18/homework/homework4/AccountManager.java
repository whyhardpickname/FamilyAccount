package homework.homework4;

/**
 * @author MarkChern
 */
public class AccountManager {
      private Account account;

      public AccountManager(Account account) {
            this.account = account;
      }

      public synchronized void deposit() {
            double amount = Math.random() * 10000;
            System.out.println(Thread.currentThread().getName() + "开始存钱，目前账户状态：" + account);
            System.out.println("本次存钱数目：" + amount + "元");
            account.setBalance(account.getBalance() + amount);
            System.out.println(Thread.currentThread().getName() + "存钱结束，目前账户状态：" + account);
            this.notify();
      }

      public synchronized void withdraw() {
            double amount = Math.random() * 10000;
            System.out.println(Thread.currentThread().getName() + "开始取钱，目前账户状态：" + account);
            System.out.println("本次取钱数目：" + amount + "元");
            while (amount > account.getBalance()) {
                  System.out.println("余额不足...");
                  try {
                        this.wait();
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
            account.setBalance(account.getBalance() - amount);
            System.out.println(Thread.currentThread().getName() + "取钱结束，目前账户状态：" + account);
      }
}
