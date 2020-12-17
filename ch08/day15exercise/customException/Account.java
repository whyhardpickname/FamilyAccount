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

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}
