package interfaceEx1;

/**
 * @author MarkChern
 * date 2020/11/29 7:07
 */
public class Dog implements MyRunnable
{
    @Override
    public void run()
    {
        System.out.println("用四肢跑");
    }
}
