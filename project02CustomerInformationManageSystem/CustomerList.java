import java.util.ArrayList;

/**
 * @author MarkChern
 * date 2020/11/8 6:33
 */
public class CustomerList
{
    private ArrayList<Customer> customers;

    public CustomerList()
    {
        customers = new ArrayList<>();
    }

    public void add(String name, String gender, String age, String phoneNumber, String email)
    {
        try
        {
            customers.add(new Customer(name, gender, Integer.parseInt(age), phoneNumber, email));
        }
        catch (NumberFormatException e)
        {
            System.out.println("添加失败，客户年龄有误。");
        }
    }

    public void set(int index, String name, String gender, String age, String phoneNumber, String email)
    {
        Customer customer = customers.get(index);
        System.out.println(name);
        if (name.compareTo("") != 0)
        {
            customer.setName(name);
        }
        if (gender.compareTo("") != 0)
        {
            customer.setGender(gender);
        }
        if (age.compareTo("") != 0)
        {
            try
            {
                customer.setAge(Integer.parseInt(age));
            } catch (NumberFormatException e)
            {
                System.out.println("age must be age.");
            }
        }
        if (phoneNumber.compareTo("") != 0)
        {
            customer.setPhoneNumber(phoneNumber);
        }
        if (email.compareTo("") != 0)
        {
            customer.setEmail(email);
        }
    }

    public void remove(int index)
    {
        customers.remove(index);
    }

    public int size()
    {
        return customers.size();
    }

    public Customer get(int index)
    {
        return customers.get(index);
    }
}
