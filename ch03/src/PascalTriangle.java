/**
 * @author MarkChern
 * @date 2020/9/28 6:45
 */
public class PascalTriangle
{
    public static void main(String[] args)
    {
        int rows = Integer.parseInt(args[0]);
        int[][] pascalTriangle = new int[rows][];
        pascalTriangle[0] = new int[1];
        pascalTriangle[0][0] = 1;

        for (int i = 1; i < pascalTriangle.length; i++)
        {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][pascalTriangle[i].length - 1] = 1;
            for (int j = 1; j < pascalTriangle[i].length - 1; j++)
            {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }


        for (int i = 0; i < pascalTriangle.length; i++)
        {
            for (int j = 0; j < pascalTriangle[i].length; j++)
            {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
