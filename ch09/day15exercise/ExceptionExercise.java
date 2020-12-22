package day15exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/12/13 7:34
 */
public class ExceptionExercise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            try
            {
                int a = 0;
                int b = 0;
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a + b);
                System.out.println(a - b);
                System.out.println(a * b);
                System.out.println(a / b);
                break;
            }
            catch (InputMismatchException e)
            {
                System.err.println("输入有误");
                input.nextLine();
            }
            catch (ArithmeticException e)
            {
                System.err.println("除零");
                input.nextLine();
            }
        }
        input.close();
    }
}
