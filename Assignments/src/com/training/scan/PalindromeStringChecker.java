package com.training.scan;

import java.util.Scanner;

public class PalindromeStringChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String ");
		
		String word = sc.next();
		
		String rstlword = word.replaceAll("//s+", "").toLowerCase();
		
		String reverseword = new StringBuilder(rstlword).reverse().toString();
		
		
		if(rstlword.equals(reverseword)) {
			
			   System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
		
		
		sc.close();
	}

}
