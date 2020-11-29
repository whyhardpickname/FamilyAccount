package comparator;

import java.util.Comparator;

/**
 * @author MarkChern
 * date 2020/11/29 8:00
 */
public class ScoreComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return Integer.compare(s1.getScore(), s2.getScore());
    }
}
