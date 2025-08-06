package com.training.basic;

import java.util.Scanner;

public class ReverseArray {

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
        
        int start =0;
        int end = size-1;
		while(start < end) {
			int temp = numbers[start];//10 20
			numbers[start]=numbers[end];//40 30
			numbers[end]= temp;//10 20
			start++;//1 2
			
			end --;//2 1
			
			
		}
		
		 System.out.println("\nReversed array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	}

}
