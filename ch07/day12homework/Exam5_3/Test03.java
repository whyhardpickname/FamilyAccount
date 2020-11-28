package day12homework.Exam5_3;

/**
 * @author MarkChern
 * date 2020/11/28 7:10
 */
public class Test03
{
    public static void main(String[] args)
    {
        Person[] people = new Person[3];
        people[0] = new Chinese();
        people[1] = new American();
        people[2] = new Indian();

        for (Person p : people)
        {
            p.eat();
        }
    }
}
