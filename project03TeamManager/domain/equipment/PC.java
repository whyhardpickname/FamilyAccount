package domain.equipment;

import domain.equipment.Equipment;

/**
 * 台式电脑类{@code PC}是应用了设备接口{@code Equipment}的类。
 *
 * <p>台式电脑主要作为程序员类{@code Programmer}及其子类领用的电子设备。
 *
 * @author MarkChern
 */
public class PC implements Equipment
{
    private String model;
    private String display;

    public PC(String model, String display)
    {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription()
    {
        return "PC{" +
                "model='" + model + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
