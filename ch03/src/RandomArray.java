import java.util.Random;

/**
 * @author MarkChern
 * @create 2020/9/29 7:16
 */
public class RandomArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 6; i++)
        {
            Random random = new Random();
            int n = i + random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i < 6; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
