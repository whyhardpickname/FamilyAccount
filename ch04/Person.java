/**
 * @author MarkChern
 * date 2020/11/3 6:59
 */
public class Person
{
    private String name;
    private int age;

    public Person()
    {
        age = 18;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("age can't be negative");
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
