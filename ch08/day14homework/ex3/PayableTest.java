package day14homework.ex3;

/**
 * @author MarkChern
 * date 2020/12/10 7:27
 */
public class PayableTest
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.print(Payment.values()[i].name() + ": ");
            Payment.values()[i].pay();
        }
    }
}
