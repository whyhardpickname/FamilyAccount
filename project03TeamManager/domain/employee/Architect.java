package domain.employee;

import domain.equipment.Equipment;
import servise.Status;

/**
 * 架构师类{@code Architect}是设计师类{@code Designer}的子类，区别是拥有股票。
 *
 * <p>架构师主要作为开发团队的一员。
 *
 * @author MarkChern
 */
public class Architect extends Designer
{
    private int stock;

    public Architect(int id, String name, int age, double salary, int memberID, Status status, Equipment equipment, double bonus, int stock)
    {
        super(id, name, age, salary, memberID, status, equipment, bonus);
        this.stock = stock;
    }
}
