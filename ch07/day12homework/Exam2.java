package day12homework;

/**
 * @author MarkChern
 * date 2020/11/28 6:28
 */
public class Exam2 {
    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.x);
    }
}
class Base{
    int x = 1;
}
class Sub extends Base{
    int x = 2;
}
