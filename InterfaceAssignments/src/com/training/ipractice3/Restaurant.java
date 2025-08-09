package com.training.ipractice3;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		System.out.println("Menu Details :: ");
		Scanner sc= new Scanner(System.in);
		IMenu  iMenu = (type)->{
			
			if(type .equals("Indian")) {
			return	new String[] {"Veg Rice","Idli","Dosa"};
			}
			else if(type .equals("International") ) {
				return new String[] { "Spaghetti Carbonara", "Grilled Chicken", "Sushi" };
				}
			else {
				return new String[] { "Invalid menu type. Please choose Menu type as Indian or International" };

			}
			
		};
		System.out.print("Choose Menu as (Indian/International): ");
		String type = sc.next();
		System.out.println(type);
		String[]menuDetails=iMenu.menuDetails(type);
		
		for(String menu : menuDetails) {
			System.out.print(" "+menu);
		}
		
		sc.close();
		

	}

}
