package domain.equipment;

import domain.equipment.Equipment;

/**
 * 显示屏类{@code Printer}是应用了设备接口{@code Equipment}的类。
 *
 * <p>显示屏主要作为程序员类{@code Programmer}及其子类领用的电子设备。
 *
 * @author MarkChernNoteBook
 */
public class Printer implements Equipment
{
    private String type;
    private String name;

    public Printer(String type, String name)
    {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getDescription()
    {
        return "Printer{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
