package day15exercise.customException;

/**
 * @author MarkChern
 * date 2020/12/18 6:21
 */
public class AccountTest
{
    public static void main(String[] args)
    {
        Account account = new Account(1122, 20000, 4.5);
        try
        {
            account.withdraw(30000);
        }
        catch (AccountException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println(account.getBalance());
        }

        try
        {
            account.withdraw(2500);
            account.deposit(3000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println(account);
        }
    }
}
