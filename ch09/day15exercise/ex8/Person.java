package day15exercise.ex8;

/**
 * @author MarkChern
 * date 2020/12/23 6:24
 */
public class Person
{
    private String name;
    private double lifeValue;

    public Person()
    {
    }

    public Person(String name, double lifeValue)
    {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getLifeValue()
    {
        return lifeValue;
    }

    public void setLifeValue(double lifeValue)
    {
        if (lifeValue < 0)
        {
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
