/**
 * @author MarkChern
 * date 2020/10/31 6:20
 */
public class Recursion
{
    public static void main(String[] args)
    {
        System.out.println(f1(10));
        System.out.println(f2(10));
    }

    public static int f1(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else if (n == 1)
        {
            return 4;
        }
        return 2 * f1(n - 1) + f1(n - 2);
    }

    public static int f2(int n)
    {
        if (n == 20)
        {
            return 1;
        }
        else if (n == 21)
        {
            return 4;
        }
        return f2(n + 2) - 2 * f2(n + 1);
    }
}
