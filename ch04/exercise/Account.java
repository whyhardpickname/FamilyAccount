/**
 * @author MarkChern
 * date 2020/11/5 6:37
 */
package exercise;
public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }

    public void withdraw(double amount) throws IllegalArgumentException
    {
        if (amount > balance)
        {
            throw new IllegalArgumentException("The balance is not enough.");
        }
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public static void main(String[] args)
    {
        Account account = new Account(1, 1000, 0.1);
        try
        {
            account.withdraw(200);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
        System.out.println(account);
    }
}
