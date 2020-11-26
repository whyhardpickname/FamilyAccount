package abstractEx;

import javax.naming.Name;

/**
 * @author MarkChern
 * date 2020/11/26 6:57
 */
public class Oviparity extends Animal
{
    public Oviparity(String name)
    {
        super.setName(name);
    }

    @Override
    public void giveBirthTo()
    {
        System.out.println(getName() +  "是卵生动物");
    }
}
