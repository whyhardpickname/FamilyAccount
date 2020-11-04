/**
 * @author MarkChern
 * date 2020/11/5 6:20
 */
public class Boy
{
    private String name;
    private int age;

    public Boy(){}

    public Boy(String name)
    {
        this(name, 18);
    }

    public Boy(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Boy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args)
    {
        Boy boy = new Boy("bob");
        System.out.println(boy);
    }
}
