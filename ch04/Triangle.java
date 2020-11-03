/**
 * @author MarkChern
 * date 2020/11/4 6:37
 */
public class Triangle
{
    private double height;
    private double width;

    public Triangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return height * width / 2;
    }
}
