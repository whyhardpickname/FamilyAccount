public class Account
{
	private String type;
	private double balance;
	private double amount;
	private String detail;
	
	public Account(String type, double balance, double amount, String detail)
	{
		this.type = type;
		this.balance = balance;
		this.amount = amount;
		this.detail = detail;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String getDetail()
	{
		return detail;
	}
}