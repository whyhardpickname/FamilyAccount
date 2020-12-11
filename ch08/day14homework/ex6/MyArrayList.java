package day14homework.ex6;

/**
 * @author MarkChern
 * date 2020/12/10 8:22
 */
public class MyArrayList implements Touchable
{
    private Object[] all = new Object[2];
    private int size;

    public void add(Object element)
    {
        if (size == all.length)
        {
            resize();
        }
        all[size++] = element;
    }

    public void remove(int index)
    {
        if (index < 0 || index > size)
        {
            System.out.println("The element is not exits.");
        }
        for (int i = index; i < size - 1; i++)
        {
            all[i] = all[i + 1];
        }
        all[--size] = null;
    }

    public void set(int index, Object value)
    {
        if (index < 0 || index > size)
        {
            System.out.println("The element is not exits.");
        }
        all[index] = value;
    }

    public Object get(int index)
    {
        return all[index];
    }

    @Override
    public Selector select()
    {
        return new MySelector();
    }

    private void resize()
    {
        Object[] newAll = new Object[2 * all.length];
        for (int i = 0; i < size; i++)
        {
            newAll[i] = all[i];
        }
        all = newAll;
    }

    private class MySelector implements Selector
    {
        int cursor;

        @Override
        public boolean hasNext()
        {
            return cursor != size;
        }

        @Override
        public Object next()
        {
            return all[cursor++];
        }
    }
}
