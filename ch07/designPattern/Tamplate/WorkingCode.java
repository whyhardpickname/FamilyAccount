package designPattern.Tamplate;

/**
 * @author MarkChern
 * date 2020/11/26 8:24
 */
public class WorkingCode extends StopWatch
{
    @Override
    protected void workingCode()
    {
        int sum = 0;
        for (int i = 0; i < 1000000; i++)
        {
            sum += i;
        }
    }

    public static void main(String[] args)
    {
        WorkingCode workingCode = new WorkingCode();
        System.out.println("耗时： " + workingCode.timing());
    }
}
