package day15exercise.ex8;

/**
 * @author MarkChern
 * date 2020/12/23 6:27
 */
public class Test08
{
    public static void main(String[] args)
    {
        //Person person1 = new Person("alice", -1);
        Person person2 = new Person();
        try
        {
            person2.setLifeValue(100);
            person2.setLifeValue(-1);
        }
        catch (NoLifeValueException e)
        {
            System.err.printf(e.getMessage());
        }
    }
}
