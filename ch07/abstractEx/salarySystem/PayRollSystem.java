package abstractEx.salarySystem;

import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/26 8:48
 */
public class PayRollSystem
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("alice", new MyDate(2020, 1, 1),
                4200,30, 25);

        employees[1] = new HourlyEmployee("bob", new MyDate(2020, 11, 1),
                20, 40);
        
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();

        for (Employee e : employees)
        {
            System.out.println(e + " earning " + e.earning(month));
        }
    }
}
