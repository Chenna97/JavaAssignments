package com.training.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		
		int size = sc.nextInt();
		
		int[] numbers = new int [size];
		
		System.out.println("Enter " + size + " numbers:");
		
		for(int i= 0; i< size; i++) {
			
			numbers[i]= sc.nextInt();
		}
		
		System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        

        
        Arrays.sort(numbers);

		
		 System.out.println("\nsorted array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	}

}
