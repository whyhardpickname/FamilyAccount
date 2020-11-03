/**
 * @author MarkChern
 * date 2020/11/3 7:00
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        Person person = new Person("alice", 18);
        System.out.println(person.getName());

        try
        {
            person.setAge(-1);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
}
