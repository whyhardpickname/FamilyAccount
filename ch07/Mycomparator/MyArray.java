package Mycomparator;

import java.util.Comparator;

/**
 * @author MarkChern
 * date 2020/11/30 7:35
 */
public class MyArray
{
    public static void sort(Object[] objects)
    {
        for (int i = 1; i < objects.length; i++)
        {
            for (int j = 1; j < objects.length - i; j++)
            {
                Student s1 = (Student) objects[j - 1];
                Student s2 = (Student) objects[j];
                if (s1.compareTo(s2) > 0)
                {
                    Object temp = objects[j - 1];
                    objects[j - 1] = objects[j];
                    objects[j] = temp;
                }
            }
        }
    }
    public static void sort(Object[] objects, Comparator comparator)
    {
        for (int i = 1; i < objects.length; i++)
        {
            for (int j = 1; j < objects.length - i; j++)
            {
                if (comparator.compare(objects[j - 1], objects[j]) > 0)
                {
                    Object temp = objects[j - 1];
                    objects[j - 1] = objects[j];
                    objects[j] = temp;
                }
            }
        }
    }


}
