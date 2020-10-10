/**
 * @author MarkChern
 * @date 2020/10/10 7:31
 */
public class SquareArray {
    public static void main(String[] args)
    {
        int n = 5;
        int[][] array = new int[n][n];
        int count = 1;
        for (int k = 0; k < (n + 1) / 2; k++)
        {
            int i = k;
            int j = k;
            while (j < n - 1 - k)
            {
                array[i][j] = count++;
                j++;
            }
            while (i < n - 1 - k)
            {
                array[i][j] = count++;
                i++;
            }
            while (j > k)
            {
                array[i][j] = count++;
                j--;
            }
            while (i > k)
            {
                array[i][j] = count++;
                i--;
            }
        }
        if (n % 2 != 0)
        {
            int mid = (n + 1) / 2 - 1;
            array[mid][mid] = count;
        }
        for (int i = 0; i < n; i ++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
