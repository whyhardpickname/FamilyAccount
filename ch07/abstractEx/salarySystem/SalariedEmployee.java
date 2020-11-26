package abstractEx.salarySystem;

/**
 * @author MarkChern
 * date 2020/11/26 8:40
 */
public class SalariedEmployee extends Employee
{
    private double monthlySalary;
    private int workingDay;
    private int totalDays;

    public SalariedEmployee()
    {
    }

    public SalariedEmployee(double monthlySalary, int workingDay, int totalDays)
    {
        this.monthlySalary = monthlySalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public SalariedEmployee(String name, MyDate birthday, double monthlySalary, int workingDay, int totalDays)
    {
        super(name, birthday);
        this.monthlySalary = monthlySalary;
        this.workingDay = workingDay;
        this.totalDays = totalDays;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    public int getWorkingDay()
    {
        return workingDay;
    }

    public void setWorkingDay(int workingDay)
    {
        this.workingDay = workingDay;
    }

    public int getTotalDays()
    {
        return totalDays;
    }

    public void setTotalDays(int totalDays)
    {
        this.totalDays = totalDays;
    }

    @Override
    public double earning(int month)
    {
        return monthlySalary * workingDay / totalDays
                + ((month == getBirthday().getMonth()) ? 100 : 0);
    }

    @Override
    public String toString()
    {
        return "Salaried " + super.toString();
    }
}
