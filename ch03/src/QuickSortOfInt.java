/**
 * @author MarkChern
 * date 2020/10/11 11:12
 */
public class QuickSortOfInt
{
    public static void quickSort(int[] a)
    {
        quickSort(a, 0, a.length - 1);
    }
    public static void quickSort(int[] a, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(a, left, right);
            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
    }
    public static int partition(int[] a, int left, int right)
    {
        swap(a, left, right);
        int store = left;
        for (int i = left; i <= right - 1; i++)
        {
            if (a[i] <= a[right])
            {
                swap(a, i, store);
                store++;
            }
        }
        swap(a, store, right);
        return store;
    }
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args)
    {
        int[] a = {6, 5, 3, 1, 4, 2, 7};
        quickSort(a);
        for (int i : a)
        {
            System.out.print(i + " ");
        }
    }
}
