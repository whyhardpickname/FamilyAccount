package day15exercise.ex9;

import java.util.ArrayList;

/**
 * @author MarkChern
 * date 2020/12/23 6:50
 */
public class OutOfMemoryErrorDemo
{
    public static void main(String[] args)
    {
        int a[] = new int[Integer.MAX_VALUE];
    }
}
