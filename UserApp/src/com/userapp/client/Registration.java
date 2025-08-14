package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Registration {

	public static void main(String[] args) {
		System.out.println("Login Details...");
		Scanner sc =new Scanner(System.in);
		
		IValidationService iValidationservice = new ValidationServiceImpl();
		
//		if name is available, handle NameExistsException, and terminate exception 
//		If name is not available , then  only get password,  
		try {
			System.out.println("Enter Name to login ");
			String username= sc.next();
			iValidationservice.validateUsername(username);
//			If password is correct then print “welcome “+username.“You are registered”  
//			If not correct throw exception 
			System.out.println("Enter password to login ");
			String password=sc.next();
				iValidationservice.validatePassword(password);
				System.out.println("Welcome " + username + ". You are registered!");
			} catch (TooShortException | TooLongException e) {
				System.out.println(e.getMessage());
			}
			 catch (NameExistsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Registration Completed");
		}
			
		sc.close();

	}

}
