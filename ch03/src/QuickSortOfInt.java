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
    public static int quickSort(int[] a, int lo, int hi)
    {
        if (lo >= hi)
        {
            return 0;
        }
        int mi = subSort(a, lo, hi);
        quickSort(a, lo, mi - 1);
        quickSort(a, mi + 1, hi);
        return 0;
    }
    public static int subSort(int[] a, int lo, int hi)
    {
        int i = lo + 1;
        int j = hi;
        int pivot = a[lo];
        while (i < j)
        {
            while (i < hi && a[i] <= pivot)
            {
                i++;
            }
            while (j >= lo && a[j] > pivot)
            {
                j--;
            }
            swap(a, i, j);
        }
        swap(a, lo, j);
        return j;
    }
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args)
    {
        int[] a = {6, 5, 4, 3, 2, 1};
        quickSort(a);
        for (int i : a)
        {
            System.out.print(i + " ");
        }
    }
}
