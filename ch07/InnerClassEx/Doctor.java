package InnerClassEx;

/**
 * @author MarkChern
 * date 2020/12/3 7:55
 */
public class Doctor
{
    public static void swap(Body body1, Body body2)
    {
       Body temp = new Body();
       temp.setHealth(body1.isHealth());
       temp.setHeart(body1.getHeart());

       body1.setHealth(body2.isHealth());
       body1.setHeart(body2.getHeart());

       body2.setHealth(temp.isHealth());
       body2.setHeart(temp.getHeart());
    }
}
