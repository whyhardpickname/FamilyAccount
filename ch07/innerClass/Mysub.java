package innerClass;


/**
 * @author MarkChern
 * date 2020/12/2 7:51
 */
public class Mysub extends Outer.Inner
{
    public Mysub(Outer outer)
    {
        outer.super();
    }

    @Override
    public void test()
    {
        System.out.println("hello");
    }
}
