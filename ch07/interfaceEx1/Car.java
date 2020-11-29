package interfaceEx1;

/**
 * @author MarkChern
 * date 2020/11/29 7:05
 */
public class Car implements MyRunnable
{
    @Override
    public void run()
    {
        System.out.println("用轮子跑");
    }
}
