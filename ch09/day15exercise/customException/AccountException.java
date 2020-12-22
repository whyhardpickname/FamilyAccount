package day15exercise.customException;

/**
 * @author MarkChern
 * date 2020/12/18 6:27
 */
public class AccountException extends RuntimeException
{
    public AccountException()
    {
    }

    public AccountException(String message)
    {
        super(message);
    }
}
