/**
 * @author MarkChern
 * date 2020/10/30 6:54
 */
public class PassObject
{
    public static void printObject(Circle c, int time)
    {
        for (int i = 1; i <= time; i++)
        {
            c.setRadius(i);
            System.out.println(i + " " + c.findArea());
        }
    }

    public static void main(String[] args)
    {
        Circle c = new Circle(6);
        printObject(c, 5);
        System.out.println(c.getRadius());
    }
}
