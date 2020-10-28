/**
 * @author MarkChern
 * date 2020/10/29 6:25
 */
public class OverLoadTest
{
    public static int myOL(int i)
    {
        return i * i;
    }
    public static double myOL(int i, int j)
    {
        return i * j;
    }
    public static String myOL(String s)
    {
        return s;
    }

    public static int max(int i, int j)
    {
        return i > j ? i : j;
    }
    public static double max(double d1, double d2)
    {
        return d1 > d2 ? d1 : d2;
    }
    public static double max(double d1, double d2, double d3)
    {
        return max(max(d1, d2), d3);
    }

    public static double max(double ... doubles)
    {
        double max = 0;
        for (double d : doubles)
        {
            max = d > max ? d : max;
        }
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println(myOL(2));
        System.out.println(myOL(2, 3));
        System.out.println(myOL("abc"));

        System.out.println(max(1, 2));
        System.out.println(max(1.0, 2.5));
        System.out.println(max(1.0, 2.5, 3.5));
        System.out.println(max(1.0, 2.5, 3.5, 5.5));
    }
}
