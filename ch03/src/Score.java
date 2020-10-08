import java.util.Scanner;

/**
 * @author MarkChern
 * @date 2020/9/23 7:19
 */
public class Score
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int numsOfStudents = in.nextInt();
        int[] scores = new int[numsOfStudents];
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = in.nextInt();
            if (scores[i] > maxScore)
            {
                maxScore = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] >= maxScore - 10)
            {
                System.out.println(scores[i] + " A");
            }
            else if (scores[i] >= maxScore - 20)
            {
                System.out.println(scores[i] + " B");
            }
            else if (scores[i] >= maxScore - 30)
            {
                System.out.println(scores[i] + " C");
            }
            else
            {
                System.out.println(scores[i] + " D");
            }
        }
    }
}
