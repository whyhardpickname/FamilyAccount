package abstractEx;

/**
 * @author MarkChern
 * date 2020/11/26 6:55
 */
public abstract class Animal
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public abstract void giveBirthTo();
}
