package com.training.scan;

import java.util.Arrays;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array Size :");
		int size= sc.nextInt();
		
		int[] numbers = new int [size];
		System.out.println("Enter the elements in array");
		for(int i=0;i< size;i++) {
			
			numbers[i]= sc.nextInt();
			
		}
		
		double [] squreroot = new double[size];
		for(int i= 0;i<size;i++) {
			squreroot[i]=Math.sqrt(i);
		}
		System.out.println("Square roots array: " + Arrays.toString(squreroot));
		
		sc.close();
		
		
		

	}

}
