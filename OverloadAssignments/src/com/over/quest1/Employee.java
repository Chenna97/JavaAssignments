package com.over.quest1;

public class Employee {
	
	String name;
	String designation;
	
	
	
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}



	void calcBonus(double basicAllowance)
	{
		System.out.println("BasicAllowance of "+name+" is "+ basicAllowance);
		System.out.println("His Designation is : "+designation);
		
		
	}
	
	void calcBonus(double basicAllowance, String gift)
	{
		System.out.println("BasicAllowance of "+name+" is "+ basicAllowance);
		System.out.println("Gift of "+name+" is "+ gift);
		
	}
	
	void calcBonus(double basicAllowance, String gift , double houseAllowance)
	{
		
		System.out.println("BasicAllowance of "+name+" is "+ basicAllowance);
		System.out.println("Gift of "+name+" is "+ gift);
		System.out.println("HouseAllowance of "+name+" is "+ houseAllowance);
		
	}

}
