package exercise;

import java.util.Arrays;

/**
 * @author MarkChern
 * date 2020/11/6 6:12
 */
public class Bank
{
    private Customer[] customers = new Customer[10];
    private int numberOfCustomers = 0;

    public Bank()
    {
    }

    public void addCustomer(Customer customer)
    {
        customers[numberOfCustomers++] = customer;
    }

    public int getNumberOfCustomers()
    {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index)
    {
        return customers[index];
    }

    @Override
    public String toString()
    {
        return "Bank{" +
                "customers=" + Arrays.toString(customers) +
                ", numberOfCustomers=" + numberOfCustomers +
                '}';
    }

    public static void main(String[] args)
    {
        Account account1 = new Account(1, 1000, 0.05);
        Account account2 = new Account(2, 1000, 0.05);
        Account account3 = new Account(3, 1000, 0.05);

        Customer customer1 = new Customer("san", "zhang", account1);
        Customer customer2 = new Customer("si", "li", account2);
        Customer customer3 = new Customer("wu", "wang", account3);

        Bank bank = new Bank();
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        System.out.println(bank);
    }
}
