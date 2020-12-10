package day14homework.ex2;

/**
 * @author MarkChern
 * date 2020/12/10 7:07
 */
public class MonthTest
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 12; i++)
        {
            System.out.println(Month.getByValue(i));
        }
    }
}
