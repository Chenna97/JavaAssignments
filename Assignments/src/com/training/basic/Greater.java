package com.training.basic;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		
		int[] numbers = new int[6];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Numbers in Array");
		
		int largestNumber = numbers[0];
		
		for (int i= 0; i< numbers.length;i++) {
			
			numbers[i]= sc.nextInt();
			
			System.out.print( "  "+numbers[i]);
			
			if(numbers[i]>largestNumber) {
			  
				largestNumber= numbers[i];
				
			}
			
					}
		System.out.println(" ");
		System.out.println("Largest Number in array is " + largestNumber);

		
		sc.close();
	}

}
