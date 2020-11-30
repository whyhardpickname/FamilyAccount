package Mycomparator;

import java.util.Comparator;

/**
 * @author MarkChern
 * date 2020/11/30 7:41
 */
public class Student implements Comparable
{
    private String name;
    private int id;
    private int score;

    public Student()
    {
    }

    public Student(String name, int id, int score)
    {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }

    private class IdComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2)
        {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return s1.id - s2.id;
        }
    }

    public IdComparator idComparator()
    {
        return new IdComparator();
    }

    private class ScoreComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2)
        {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return s1.score - s2.score;
        }
    }

    public ScoreComparator scoreComparator()
    {
        return new ScoreComparator();
    }

    @Override
    public int compareTo(Object o)
    {
        Student s = (Student) o;
        return this.name.compareTo(s.name);
    }
}
