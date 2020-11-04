/**
 * @author MarkChern
 * date 2020/11/5 6:24
 */
public class Girl
{
    private String name;
    private int age;

    public Girl(){}

    public Girl(String name)
    {
        this(name, 18);
    }
    public Girl(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args)
    {
        Girl girl = new Girl("alice");
        System.out.println(girl);
    }
}
