package comparator;

import java.util.Arrays;

/**
 * @author MarkChern
 * date 2020/11/29 8:02
 */
public class ComparatorTest
{
    public static void main(String[] args)
    {
        Student[] students = new Student[3];
        students[0] = new Student("alice", 93);
        students[1] = new Student("bob", 87);
        students[2] = new Student("charlie", 97);

        ScoreComparator scorecmp = new ScoreComparator();

        Arrays.sort(students, scorecmp);

        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
