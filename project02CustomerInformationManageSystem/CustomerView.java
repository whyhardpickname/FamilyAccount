import java.util.Scanner;

/**
 * @author MarkChern
 * date 2020/11/8 6:32
 */
public class CustomerView
{
    public static void main(String[] args)
    {
        CustomerList customers = new CustomerList();
        while (true)
        {
            Utility.printMainMenu();
            int option = Utility.readOption(1, 5);
            if (option == 1)
            {
                Utility.addCustomer(customers);
            }
            else if (option == 2)
            {
                int index = Utility.readIndex(1, customers.size());
                if (index != -1)
                {
                    Utility.setCustomer(customers, index - 1);
                }
            }
            else if (option == 3)
            {
                int index = Utility.readIndex(1, customers.size());
                if (index != -1)
                {
                    Utility.removeCustomer(customers, index - 1);
                }
            }
            else if (option == 4)
            {
                if (customers.size() != 0)
                {
                    Utility.displayCustomers(customers);
                }
            }
            else if(option == 5)
            {
                Scanner in = new Scanner(System.in);
                System.out.println("确定退出，请输入Y/y.");
                String confirm = in.next();
                if (confirm.compareTo("y") == 0 | confirm.compareTo("Y") == 0)
                {
                    System.exit(1);
                }
            }
        }
    }
}
