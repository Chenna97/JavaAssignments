package com.abs.quest1;


public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
		
	}
	
	
	@Override
	void calcBonus(double amount) {
		amount+= salary;
		System.out.println("Team Lead Bonus: " + (amount * 0.15));
		
	}
	void corporateServices()
	{
		System.out.println("Corportate services are getting project within 35 days ");
	} 
	

}
