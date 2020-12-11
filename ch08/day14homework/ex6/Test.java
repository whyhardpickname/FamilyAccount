package day14homework.ex6;

import java.util.ArrayList;

/**
 * @author MarkChern
 * date 2020/12/12 6:59
 */
public class Test
{
    public static void main(String[] args)
    {
        MyArrayList list = new MyArrayList();

        list.add(1);
        list.add("two");
        list.add(3.0);

        list.remove(1);
        list.set(1, "one");
        System.out.println(list.get(1));

        Selector iter = list.select();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }

    }
}
