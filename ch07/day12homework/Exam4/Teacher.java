package day12homework.Exam4;

/**
 * @author MarkChern
 * date 2020/11/28 6:36
 */
class Person{
    public Person(){
        System.out.println("this is a Person.");
    }
}
public class Teacher extends Person{
    private String name = "tom";
    public Teacher(){
        super();
        System.out.println("this is a teacher.");
    }

    public String getName()
    {
        return name;
    }

    public static void main(String[] args){
        Teacher tea = new Teacher();
        System.out.println(tea.getName());
    }
}
