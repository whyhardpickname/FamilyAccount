package abstractEx;

/**
 * @author MarkChern
 * date 2020/11/26 6:59
 */
public class Viviparity extends Animal
{
    public Viviparity(String name)
    {
        super.setName(name);
    }

    @Override
    public void giveBirthTo()
    {
        System.out.println(getName() + "是胎生动物");
    }
}
