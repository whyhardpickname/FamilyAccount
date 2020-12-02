package innerClass;

/**
 * @author MarkChern
 * date 2020/12/2 7:52
 */
public class MysubTest
{
    public static void main(String[] args)
    {
        Mysub mysub = new Mysub(new Outer());
        mysub.test();
    }
}
