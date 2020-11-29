package interfaceEx2;

/**
 * @author MarkChern
 * date 2020/11/29 7:12
 */
public class Employee implements Comparable
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o)
    {
        Employee other = (Employee) o;
        return Double.compare(other.getSalary(), salary);
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
