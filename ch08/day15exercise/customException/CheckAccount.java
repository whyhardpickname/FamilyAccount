package day15exercise.customException;

/**
 * @author MarkChern
 * date 2020/12/18 7:03
 */
public class CheckAccount extends Account
{
    private double overdraft;

    public CheckAccount(double overdraft)
    {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft)
    {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount)
    {
        if (amount <= this.getBalance())
        {
            super.withdraw(amount);
        }
        else if (amount > this.getBalance() + overdraft)
        {
            throw new OutOfOverdraftException("超过可透支额的限额");
        }
        else
        {
            overdraft -= (amount - this.getBalance());
            this.setBalance(0);
        }
    }

    @Override
    public void deposit(double amount)
    {
        super.deposit(amount);
    }
}
