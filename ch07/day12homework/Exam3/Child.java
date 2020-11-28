package day12homework.Exam3;

/**
 * @author MarkChern
 * date 2020/11/28 6:31
 */
class Father{
    private String name = "atguigu";

    public String getName()
    {
        return name;
    }

    int age = 0;
}
public class Child extends Father{
    public String grade;

    public static void main(String[] args){
        Father f = new Child();
        System.out.println(f.getName());
    }
}
