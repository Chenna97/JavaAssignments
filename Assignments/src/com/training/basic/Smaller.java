package com.training.basic;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) {
		
		int[] numbers = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Numbers:");

        // Read first number separately
        numbers[0] = sc.nextInt();
        int smallestNumber = numbers[0]; 

        System.out.print("  " + numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            System.out.print("  " + numbers[i]);

            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Smallest Number in array is " + smallestNumber);

        sc.close();
	}

}
