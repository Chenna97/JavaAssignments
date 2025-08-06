package com.training.scan;

import java.util.Scanner;

public class ScanSmaller {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number:");
	int number1 = sc.nextInt();
	System.out.println("Enter Second Number:");
	int number2 =sc.nextInt();
	System.out.println("Enter Third Number:");
	int number3 =sc.nextInt();
	
	if((number1 < number2 ) && (number1 < number3))
	{
		System.out.println("The smallest number is:" + number1);
	}
	else if((number2 < number1 ) && (number2 < number3))
	{
		System.out.println("The smallest number is:" + number2);
	}
	else {
		System.out.println("The smallest number is:" + number3);
	}
 sc.close();
	}

}
