package com.inher.quest2;

public class Account {
	
	
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amount)
	{
		if(balance < amount) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance -=amount;
			System.out.println("Total balance after withdraw is :: " + balance);
		}
	} 
	void deposit(double amount)
	{
		
			balance +=amount;
			System.out.println("Total balance after deposit is :: " + balance);
		
		
	} 
	double getBalance()
	{
		return balance;
			
	} 
	
	

}
