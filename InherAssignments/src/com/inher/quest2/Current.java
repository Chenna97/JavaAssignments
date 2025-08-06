package com.inher.quest2;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		
	}
	
	
	
	@Override
	void withdraw(double amount)
	{
		System.out.println("Current Account Details :: ");
		
		if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" Withdraw successful from Current Account:");
        } else {
            System.out.println(" invalid amount to withdraw from Current Account:");
        }
	} 
	
	@Override
	void deposit(double amount)
	{
		System.out.println("Current Account Details :: ");
		 if (amount > 0) {
	            
			balance +=amount;
			System.out.println("Total balance after deposit from Current account is :: " + balance);
		 }
		 else {
	            System.out.println(" Invalid deposit amount");
	        }
		
	} 

}
