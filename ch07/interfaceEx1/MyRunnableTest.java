package interfaceEx1;

/**
 * @author MarkChern
 * date 2020/11/29 7:08
 */
public class MyRunnableTest
{
    public static void main(String[] args)
    {
        MyRunnable[] myRunnables = new MyRunnable[3];
        myRunnables[0] = new Car();
        myRunnables[1] = new person();
        myRunnables[2] = new Dog();

        for (MyRunnable runnable : myRunnables)
        {
            runnable.run();
        }
    }
}
