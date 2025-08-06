package com.over.quest3;

public class Processor {
	
	// print the squareroot
	void calculate(double x)
	{
		
		System.out.println("Square Root of x is :"+Math.sqrt(x) );
	} 
	// print the product 
	 void calculate(int x, int y)
	 {
		 System.out.println("Product of x and y is : "+ (x*y));
	 } 
	 // print the difference
	 void calculate(double x, double y)
	 {
		System.out.println("The difference between x and y is :" +(x-y)); 
	 } 
	// print x power y 
	 void calculate(double x,int y)
	 {
		 System.out.println("Power of x and y is : "+ Math.pow(x, y));
	 }
	// print the square
	 void calculate(int x)
	 {
		 
		System.out.println("Square of x is :" + (x*x)); 
	 }
}
