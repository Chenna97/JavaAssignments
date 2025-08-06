package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		
		int num2 =1;
		
		System.out.println("Print the fibonacci series from 1 to 100 is :");
		
		while(num2 < 100) {
			System.out.print(num2 + " ");//1 1 2 3 5 8 13 21 34 55 89
			
			
			int result= num1+num2;//1 2 3 5 8 13 21 34 55 89 144
			
			num1=num2; // 1 1 2 3 5 8 13 21 34 55 89
			
		num2  = result;//1 2 3 5 8 13 21 34 55 89 144
			
		}

	}

}
