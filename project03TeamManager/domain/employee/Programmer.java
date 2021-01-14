package domain.employee;

import domain.equipment.Equipment;
import servise.Status;

/**
 * 程序员类{@Programmer}是雇员的子类，除了雇员原有的属性，
 * 还包含成员的声明证明(menberID)领用的设备{@Equipment}和成员的状态。
 *
 * <p>程序员主要作为开发团队的一员。
 *
 * @author MarkChern
 */
public class Programmer extends Employee
{
    private int memberID;
    private Status status;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, int memberID, Status status, Equipment equipment)
    {
        super(id, name, age, salary);
        this.memberID = memberID;
        this.status = status;
        this.equipment = equipment;
    }
}
