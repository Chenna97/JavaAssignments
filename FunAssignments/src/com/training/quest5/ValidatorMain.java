package com.training.quest5;

import java.util.Scanner;

public class ValidatorMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("List of users");
		String[] registeredUsers = {"chenna", "kesava", "chandrisha","shiva"};
		
		IValidator iValidregister = (name) -> {
			
			for(String registeredUser: registeredUsers)
			{
				if(registeredUser.equalsIgnoreCase(name)) {
					return "You are already registered: " + name;
				}
				
			}
			
			return "You are  registered: " + name;
			
		};
		
		IValidator iValidLogin =(name)->{
			
			for (String user : registeredUsers) {
                if (user.equalsIgnoreCase(name)) {
                    return "You are logged in: " + name;
                }
            }
			
			return "Username not found: " + name;
			
		};
		System.out.println("Enter user name to check login or not");
		String user = sc.next();
		System.out.println(iValidLogin.validateUser(user));
		
		System.out.println("Enter user name to check registred user or not");
	System.out.println(iValidregister.validateUser(user));
		sc.close();
	}

}
