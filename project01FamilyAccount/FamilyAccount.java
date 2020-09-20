import java.util.Scanner;
import java.util.ArrayList;

public class FamilyAccount
{
	private ArrayList<Account> accounts;
	
	public FamilyAccount()
	{
		accounts = new ArrayList<Account>();
		
	}
	
	public void printAccountsTable()
	{
		System.out.printf("%10s\t%10s\t%10s\t%20s\n", "Type", "Balance", "Amount", "Detail");
		for (Account account: accounts)
		{
			System.out.printf("%10s\t%10.2f\t%10.2f\t%20s\n", account.getType(), account.getBalance()
				, account.getAmount(), account.getDetail());
		}
	}
	
	public boolean registerAccount(int option, double amount, String detail)
	{
		double balance = 1000;
		if (accounts.size() != 0)
		{
			balance = accounts.get(accounts.size() - 1).getBalance();
		}
		if (option == 2)
		{
			accounts.add(new Account("Income", balance + amount, amount, detail));
			return true;
		}
		if (option == 3 && balance >= amount)
		{
			accounts.add(new Account("Expenditure", balance - amount, amount, detail));
			return true;
		}
		return false;
	}
	
	public void pritnMainManu()
	{
		System.out.println("Family Account");
		System.out.println("1 Accounts");
		System.out.println("2 Income");
		System.out.println("3 Expenditure");
		System.out.println("4 Exit");
	}
	
	public int getOption()
	{
		System.out.print("Enter an option(1-4): ");
		Scanner in = new Scanner(System.in);
		if (!in.hasNextInt())
		{
			return -1;
		}
		int option = in.nextInt();
		if (option < 1 || option > 4)
		{
			return -1;
		}
		return option;
	}
	
	public double getAmount(int option)
	{
		if (option == 2)
		{
			System.out.print("Income: ");
		}
		else
		{
			System.out.print("Expenditure: ");
		}
		Scanner in = new Scanner(System.in);
		if (!in.hasNextDouble())
		{
			return -1;
		}
		double amount = in.nextDouble();
		return amount;
	}
	
	public void start()
	{
		while (true)
		{
			pritnMainManu();
			int option = 0;
			do 
			{
				option = getOption();
			}
			while (option == -1);
			if (option == 1)
			{
				printAccountsTable();
			}
			else if(option == 2 || option == 3)
			{
				double amount = getAmount(option);
				if (amount < 0)
				{
					continue;
				}
				System.out.print("Detail: ");
				Scanner in = new Scanner(System.in);
				String detail = "";
				if (in.hasNext())
				{
					detail = in.next();
				}
				if (!registerAccount(option, amount, detail))
				{
					continue;
				}
			}
			else
			{
				System.out.print("Are you sure to exit?(y/n): ");
				Scanner in = new Scanner(System.in);
				String command = in.next();
				if (command.compareToIgnoreCase("y") == 0 || command.compareToIgnoreCase("yes") == 0)
				{
					break;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		FamilyAccount myAccoutBook = new FamilyAccount();
		myAccoutBook.start();
	}
}

