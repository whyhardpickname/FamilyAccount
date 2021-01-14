package domain.employee;

import domain.equipment.Equipment;
import servise.Status;

/**
 * 设计师类{@code Designer}是程序员类{@code Programmer}的子类，区在在于拥有奖金。
 *
 * <p>设计师主要作为开发团队中的一员。
 *
 * @author MarkChern
 *
 */
public class Designer extends Programmer
{
    private double bonus;

    public Designer(int id, String name, int age, double salary, int memberID, Status status, Equipment equipment, double bonus)
    {
        super(id, name, age, salary, memberID, status, equipment);
        this.bonus = bonus;
    }
}
