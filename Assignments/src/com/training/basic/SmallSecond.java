package com.training.basic;

import java.util.Scanner;

public class SmallSecond {

	public static void main(String[] args) {
		
		int[] numbers = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		

		System.out.println("Enter  Numbers:");
		for (int i=0; i< numbers.length; i++) {
			
			numbers[i]= sc.nextInt();
			System.out.print(" "+ numbers[i]);
			
		}
		System.out.println(" ");
		
		 for (int number:numbers)
		 {
			 if(number < smallest) {
				 secondSmallest = smallest;
	                smallest = number;
			 }else if (number > smallest && number < secondSmallest) {
	                // Only update second smallest
	                secondSmallest = number;
	            }
			 
			 
		 }
		 if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("There is no distinct second smallest number.");
	        } else {
	            System.out.println("Second smallest number is: " + secondSmallest);
	        }

	        sc.close();
	}

}
