package domain.equipment;

/**
 * 笔记本电脑类{@code PC}是应用了设备接口{@code Equipment}的类。
 *
 * <p>笔记本电脑主要作为程序员类{@code Programmer}及其子类领用的电子设备。
 *
 * @author MarkChernNoteBook
 */
public class NoteBook implements Equipment
{
    private String model;
    private double price;

    public NoteBook(String model, double price)
    {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription()
    {
        return "NoteBook{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
