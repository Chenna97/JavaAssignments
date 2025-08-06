package com.training.basic;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int numbers = scan.nextInt();
		
		int[] number = new int[numbers];
		
		 System.out.println("Enter " + numbers + " integers:");
		 
	        for (int i = 0; i < numbers; i++) {
	        	number [i] = scan.nextInt();
	        }
		
		int sum=0;
		
		int digitcount =0;
		
		for(int num : number) {
			
			if(num ==  0) {
			 
				digitcount++;
			}
			
			while(num >0) {
				 
				int digit = num %10;
				sum += digit;
				digitcount++;
				num /= 10;
				
				
			}
			
		}
		
		double avrg = digitcount >0 ? (double) sum /digitcount : 0;
		
		System.out.println("Sum of digits: " + sum);
        System.out.println("Average of digits: " + avrg);

        scan.close();
		 
		
		
		
	}

}
