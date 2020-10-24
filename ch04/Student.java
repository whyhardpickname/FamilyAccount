/**
 * @author MarkChern
 * date 2020/10/25 7:00
 */
public class Student
{
    private String name;
    private int age;
    private String major;
    private String interests;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", interests='" + interests + '\'' +
                '}';
    }
}
