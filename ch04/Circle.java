/**
 * @author MarkChern
 * date 2020/10/30 6:52
 */
public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double findArea()
    {
        return Math.PI * radius * radius;
    }
}
