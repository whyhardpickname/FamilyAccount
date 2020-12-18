package day15exercise.customException;

/**
 * @author MarkChern
 * date 2020/12/17 7:56
 */
public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account()
    {
    }

    public Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate / 100;
    }

    public void withdraw(double amount)
    {
        if (balance < amount)
        {
            throw new AccountException("账户余额不足");
        }

        if (amount < 0)
        {
            throw new AccountException("取款金额不能为负");
        }
        balance -= amount;
    }

    public void deposit(double amount)
    {
        if (amount < 0)
        {
            throw new AccountException("存款金额不能为负");
        }
        balance += amount;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
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
}
