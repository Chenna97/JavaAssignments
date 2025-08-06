package com.training.basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter a number : ");
	        int number = scanner.nextInt();

	        int original = number; //123
	        int sum = 0;
	        int digits = 0;
	        int temp = number; //123

	        
	        if (temp == 0) {
	            digits = 1;
	        } else {
	            while (temp > 0) {
	                digits++;//1
	                temp /= 10; //12
	                
	            }
	        }

	        temp = number;//123 
	        
	      
	        while (temp > 0) {
	            int digit = temp % 10;//3 2 
	            
	            int power = 1;
	            for (int i = 1; i <= digits; i++) {
	                power *= digit;//3 
	               
	            }

	            sum += power;
	            System.out.println("Sum is :"+ sum);//
	            temp /= 10;
	            System.out.println("temp is :"+temp);//
	        }

	       
	        if (sum == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is NOT an Armstrong number.");
	        }

	        scanner.close();
	    }

}
