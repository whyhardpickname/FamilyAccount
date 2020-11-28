package day12homework.Exam5_4;

/**
 * @author MarkChern
 * date 2020/11/28 7:26
 */
public class Test04
{
    public static void main(String[] args)
    {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(3, 4, 5);

        System.out.println("triangle1.toString() " + triangle1.toString());
        System.out.println("triangle1.getArea() " + triangle1.getArea());
        System.out.println("triangle1.getPerimeter() " + triangle1.getPerimeter());
        System.out.println("triangle1.hashCode() " + triangle1.hashCode());
        System.out.println("triangle2.hashCode() " + triangle2.hashCode());
        System.out.println("triangle1.equals(triangle2) " + triangle1.equals(triangle2));
    }
}
