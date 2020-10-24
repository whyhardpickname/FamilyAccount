/**
 * @author MarkChern
 * date 2020/10/25 7:05
 */
public class Teacher
{
    private String name;
    private int age;
    private int teachAge;
    private String course;

    @Override
    public String toString()
    {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teachAge=" + teachAge +
                ", course='" + course + '\'' +
                '}';
    }
}
