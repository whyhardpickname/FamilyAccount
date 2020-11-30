package anomymousEx;

/**
 * @author MarkChern
 * date 2020/12/1 7:45
 */
public class AnomymousTest
{
    public static void main(String[] args)
    {
        Father f = new Father()
        {
            @Override
            public void method()
            {
                System.out.println("hello 孩子");
            }
        };
        f.method();
    }
}
