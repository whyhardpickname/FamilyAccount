package day14homework.ex6;

/**
 * @author MarkChern
 * date 2020/12/10 8:22
 */
public class MyArrayList implements Touchable
{
    private Object[] all;
    private int total;

    public void add(Object element)
    {

    }

    public void remove(int index)
    {

    }

    public  void set(int index, Object value)
    {

    }

    public Object get(int index)
    {
        return null;
    }

    @Override
    public Selector select()
    {
        return null;
    }

    private void resize()
    {
        Object[] newAll = new Object[2 * all.length];
    }

    private class MySelector implements Selector
    {
        int cursor;

        @Override
        public boolean hasNext()
        {
            return cursor != total;
        }

        @Override
        public Object next()
        {
            return all[cursor++];
        }
    }
}
