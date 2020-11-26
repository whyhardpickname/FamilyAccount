package abstractEx.salarySystem;

/**
 * @author MarkChern
 * date 2020/11/26 8:45
 */
public class HourlyEmployee extends Employee
{
    private double hour;
    private double wage;

    public HourlyEmployee()
    {
    }

    public HourlyEmployee(double hour, double wage)
    {
        this.hour = hour;
        this.wage = wage;
    }

    public HourlyEmployee(String name, MyDate birthday, double hour, double wage)
    {
        super(name, birthday);
        this.hour = hour;
        this.wage = wage;
    }

    public double getHour()
    {
        return hour;
    }

    public void setHour(double hour)
    {
        this.hour = hour;
    }

    public double getWage()
    {
        return wage;
    }

    public void setWage(double wage)
    {
        this.wage = wage;
    }

    @Override
    public double earning(int month)
    {
        return wage * hour + ((month == getBirthday().getMonth()) ? 100 : 0);
    }

    @Override
    public String toString()
    {
        return "Hourly" + super.toString();
    }
}
