package abstractEx.salarySystem;

/**
 * @author MarkChern
 * date 2020/11/26 8:31
 */
public abstract class Employee
{
    private String name;
    private MyDate birthday;

    public Employee()
    {
    }

    public Employee(String name, MyDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public MyDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(MyDate birthday)
    {
        this.birthday = birthday;
    }

    public abstract double earning(int month);

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
