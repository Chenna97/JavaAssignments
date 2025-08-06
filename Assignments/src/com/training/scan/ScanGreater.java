package com.training.scan;

import java.util.Scanner;

public class ScanGreater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number:");
		 int number1 = sc.nextInt();
		 
		 System.out.println("Enter Second number:");
		 int number2 = sc.nextInt();
		 
		 System.out.println("Enter Third number:");
		 int number3 = sc.nextInt();
		 
		 int maxnumber = (number1> number2)? number1 :number2;
		 
		 int greatestNumber = (maxnumber> number3)? maxnumber:number3;
		 
		 System.out.println("The Greatest number among three numbers are " +greatestNumber);
		 sc.close();
	}
	
	

}
