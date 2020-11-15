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

    public void add(String name, String gender, int age, String phoneNumber, String email)
    {
        customers.add(new Customer(name, gender, age, phoneNumber, email));
    }

    public void set(int index, String name, String gender, int age, String phoneNumber, String email)
    {
        Customer customer = customers.get(index);
        customer.setName(name);
        customer.setGender(gender);
        customer.setAge(age);
        customer.setPhoneNumber(phoneNumber);
        customer.setEmail(email);
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
