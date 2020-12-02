package anomymousEx;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author MarkChern
 * date 2020/12/1 7:48
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "alice", 10000);
        employees[1] = new Employee(2, "bob", 30000);
        employees[2] = new Employee(3, "charlie", 20000);

        Comparator idcmp = new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return e1.getId() - e2.getId();
            }
        };

        System.out.println("按编号排序");
        Arrays.sort(employees, idcmp);
        for (Employee e : employees)
        {
            System.out.println(e);
        }

        Comparator salarycmp = new Comparator()
        {
            @Override
            public int compare(Object o1, Object o2)
            {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        };
        System.out.println("按薪资排序");
        Arrays.sort(employees, salarycmp);
        for (Employee e : employees)
        {
            System.out.println(e);
        }
    }
}