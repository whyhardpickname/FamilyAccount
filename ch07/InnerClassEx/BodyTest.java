package InnerClassEx;

/**
 * @author MarkChern
 * date 2020/12/3 7:01
 */
public class BodyTest
{
    public static void main(String[] args)
    {
        Body body = new Body("alice", 56, true);
        System.out.println(body);

        Body body2 = new Body("bob", 65, false);
        System.out.println(body2);
        body2.setHealth(true);
        System.out.println(body2);
    }
}
