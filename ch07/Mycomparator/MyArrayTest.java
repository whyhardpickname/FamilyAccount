package Mycomparator;

/**
 * @author MarkChern
 * date 2020/11/30 7:46
 */
public class MyArrayTest
{
    public static void main(String[] args)
    {
        Student[] students = new Student[3];
        students[0] = new Student("alice", 2, 87);
        students[1] = new Student("bob", 1, 92);
        students[2] = new Student("charlie", 3, 96);

        for (Student student : students)
        {
            System.out.println(student);
        }
        MyArray.sort(students, new Student().idComparator());
        System.out.println("按id排序后");
        for (Student student : students)
        {
            System.out.println(student);
        }
        /*System.out.println("按成绩排序后");
        MyArray.sort(students, new Student().scoreComparator());
        for (Student student : students)
        {
            System.out.println(student);
        }*/

        System.out.println("按名字的字母表顺序排列");
        MyArray.sort(students);
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
