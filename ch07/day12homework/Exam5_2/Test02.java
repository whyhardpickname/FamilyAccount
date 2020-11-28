package day12homework.Exam5_2;

/**
 * @author MarkChern
 * date 2020/11/28 6:56
 */
public class Test02
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];
        people[0] = new Woman();
        people[1] = new Man();

        for (Person p : people)
        {
            p.pee();
        }
    }
}
