package com.training.basic;

import java.util.Scanner;

public class LargeSecond {

	public static void main(String[] args) {
		
int[] numbers = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		

		System.out.println("Enter  Numbers:");
		for (int i=0; i< numbers.length; i++) {
			
			numbers[i]= sc.nextInt();
			System.out.print(" "+ numbers[i]);
			
		}
		System.out.println(" ");
		
		 for (int number:numbers)
		 {
			 if(number > largest) {
				 secondLargest = largest;
				 largest = number;
			 }else if (number < largest && number > secondLargest) {
	                // Only update second Largest
				 secondLargest = number;
	            }
			 
			 
		 }
		 if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no distinct second smallest number.");
	        } else {
	            System.out.println("Second smallest number is: " + secondLargest);
	        }

	        sc.close();

	}

}
