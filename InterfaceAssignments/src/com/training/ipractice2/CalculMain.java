package com.training.ipractice2;

import java.util.Scanner;

public class CalculMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Using Lambda Expressions");
		
		ICalculator iCalculator =(x,y)->{
			int z=0;
		//Adding 
			z =x+y;
			System.out.println("Addition of x and y is  "+ z);
			//Multiplication
			z=x*y;
			System.out.println("Multiplication of x and y is :: "+z);
			//Division
			z=x/y;
			System.out.println("Divison of x and y is :: "+z);
			//Subtraction
			z=x-y;
			System.out.println("Subtraction of x and y is :: " +z);
			//Modulus 
			
			z=x%y;
			System.out.println("Modulus of x and y is :: "+z);
			
		};
		System.out.println("calling Interface  method");
		System.out.println("Enter first parameter value of x  ::");
		int x= sc.nextInt();
		System.out.println("Enter Second parameter value of y ::");
		int y= sc.nextInt();
		
		iCalculator.calculator(x, y);
sc.close();
	}

}
