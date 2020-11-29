package interfaceEx2;

import java.util.Arrays;

/**
 * @author MarkChern
 * date 2020/11/29 7:25
 */
public class ComparableTest
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "alice", 25, 10000);
        employees[1] = new Employee(2, "bob", 25, 30000);
        employees[2] = new Employee(3, "charlie", 25, 20000);

        Arrays.sort(employees);

        for (Employee e : employees)
        {
            System.out.println(e);
        }
    }
}
