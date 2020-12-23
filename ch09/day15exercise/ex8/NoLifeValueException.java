package day15exercise.ex8;

/**
 * @author MarkChern
 * date 2020/12/23 6:23
 */
public class NoLifeValueException extends RuntimeException
{
    public NoLifeValueException()
    {
    }

    public NoLifeValueException(String message)
    {
        super(message);
    }
}
