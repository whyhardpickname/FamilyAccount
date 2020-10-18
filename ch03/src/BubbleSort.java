/**
 * @author MarkChern
 * date 2020/10/11 10:52
 */
public class BubbleSort {
    public static void bubbleSort(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            boolean isSwap = false;
            for (int j = 0; j < a.length - 1 - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a = {4, 3, 2, 1};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
