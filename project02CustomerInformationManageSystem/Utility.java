import jdk.nashorn.internal.ir.ContinueNode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/8 6:34
 */
public class Utility
{
    public static void printMainMenu()
    {
        System.out.println("客户信息管理软件");
        System.out.println("1 添加客户");
        System.out.println("2 修改客户");
        System.out.println("3 删除客户");
        System.out.println("4 客户列表");
        System.out.println("5 退出");
    }

    public static int readOption(int start, int end)
    {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (n < start || n > end)
        {
            System.out.printf("请选择(%d-%d): ", start, end);
            if (in.hasNextInt())
            {
                n = in.nextInt();
            }
            else
            {
                in.nextLine();
            }
        }
        return n;
    }

    public static int readIndex(int start, int end)
    {
        Scanner in = new Scanner(System.in);
        int n = -2;
        while ((n < start || n > end) && n != -1)
        {
            System.out.print("请输入待修改客户编号(-1退出)：");
            if (!in.hasNext())
            {
                System.out.println("无法找到指定客户编号");
            }
            n = in.nextInt();
            if ((n < start || n > end) && n != -1)
            {
                System.out.println("无法找到指定客户编号");
            }
        }
        return n;
    }



    public static void addCustomer(CustomerList customers)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("姓名: ");
        String name = in.nextLine();
        System.out.print("性别：");
        String gender = in.nextLine();
        System.out.print("年龄：");
        String age = in.nextLine();
        System.out.print("电话：");
        String phoneNumber = in.nextLine();
        System.out.print("邮箱：");
        String email = in.nextLine();

        customers.add(name, gender, Integer.parseInt(age), phoneNumber, email);
    }

    public static void setCustomer(CustomerList customers, int index)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("姓名(" + customers.get(index).getName() + "): ");
        String name = in.nextLine();
        System.out.print("性别(" + customers.get(index).getGender() + "): ");
        String gender = in.nextLine();
        System.out.print("年龄(" + customers.get(index).getAge() + "): ");
        String age = in.nextLine();
        System.out.print("电话(" + customers.get(index).getPhoneNumber() + "): ");
        String phoneNumber = in.nextLine();
        System.out.print("邮箱(" + customers.get(index).getEmail() + "): ");
        String email = in.nextLine();

        customers.set(index, name, gender, Integer.parseInt(age), phoneNumber, email);
    }

    public static void  displayCustomers(CustomerList customers)
    {
        System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-11s\t%-15s\n",
                "编号", "姓名", "性别", "年龄", "电话","邮箱");
        for (int i = 0; i < customers.size(); i++)
        {
            System.out.printf("%-4d\t%-4s\t%-4s\t%-4d\t%-11s\t\t%-15s\n", i + 1,
                    customers.get(i).getName(),
                    customers.get(i).getGender(),
                    customers.get(i).getAge(),
                    customers.get(i).getPhoneNumber(),
                    customers.get(i).getEmail());
        }
    }
    public static void removeCustomer(CustomerList customers, int index)
    {
        customers.remove(index);
    }
    public static void main(String[] args)
    {
        CustomerList customerList = new CustomerList();
        customerList.add("张三", "男",28, "12345678911", "1234@11.com");
        customerList.add("李四", "男",28, "123444798", "1234@11.com");
        displayCustomers(customerList);
    }
}
