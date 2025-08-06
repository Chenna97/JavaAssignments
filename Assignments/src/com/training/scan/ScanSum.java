package com.training.scan;

import java.util.Scanner;

public class ScanSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.println("Enter the array "+size+"elements ");
		
		
		int sum=0;
		
		for(int i=0;i< size ; i++) {
			numbers[i]=sc.nextInt();
			sum += numbers[i];
		}
		
		double average = (size>0)? (double)sum /size:0;
		
		System.out.println("The sum of array is "+sum);
		System.out.println("The average of numbers in array is "+ average);
		
		sc.close();
	}

}
