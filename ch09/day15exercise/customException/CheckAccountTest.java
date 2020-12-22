package day15exercise.customException;

/**
 * @author MarkChern
 * date 2020/12/18 7:09
 */
public class CheckAccountTest
{
    public static void main(String[] args)
    {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 4.5, 5000);

        try
        {
            checkAccount.withdraw(5000);
        }
        catch (OutOfOverdraftException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println(checkAccount);
        }
        try
        {
            checkAccount.withdraw(18000);
        }
        catch (OutOfOverdraftException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println(checkAccount);
        }
        try
        {
            checkAccount.withdraw(3000);
        }
        catch (OutOfOverdraftException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println(checkAccount);
        }
    }
}
