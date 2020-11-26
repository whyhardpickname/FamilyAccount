package designPattern.Tamplate;

import javafx.concurrent.Worker;

/**
 * @author MarkChern
 * date 2020/11/26 8:20
 */
public abstract class StopWatch
{
    public final long timing()
    {
        long start = System.currentTimeMillis();

        workingCode();

        long end = System.currentTimeMillis();

        return end - start;
    }

    protected abstract void workingCode();
}
