package abstractEx;

/**
 * @author MarkChern
 * date 2020/11/26 7:00
 */
public class Test
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[2];
        animals[0] = new Oviparity("chicken");
        animals[1] = new Viviparity("dog");

        for (Animal animal : animals)
        {
            animal.giveBirthTo();
        }
    }
}
