package pbankaccount;

public class BankAccount {
	private double balance;
	public double getBalance() 
	{
		return balance;
	}
	
	public BankAccount() 
	{
		balance = 0;
	}
	public void deposit(int i) 
	{
		balance += i;
	}
	public void withdraw(int i) 
	{
		balance -=  i;
	}
	public void addInterest() 
	{
		double i = balance * 0.05;
		double tax = i * 0.33;
		i -= tax;
		balance = balance + i;
	}
}