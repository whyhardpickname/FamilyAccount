package day15exercise.customException;

/**
 * @author MarkChern
 * date 2020/12/18 7:05
 */
public class OutOfOverdraftException extends AccountException
{
    public OutOfOverdraftException()
    {
    }

    public OutOfOverdraftException(String message)
    {
        super(message);
    }
}
