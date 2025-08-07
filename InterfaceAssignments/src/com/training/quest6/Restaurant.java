package com.training.quest6;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant!");
        System.out.print("Choose cuisine (Indian/International): ");
        String cuisineChoice = sc.next();

        ICuisine cuisine;

        if (cuisineChoice.equalsIgnoreCase("Indian")) {
            cuisine = new Indian();
        } else if (cuisineChoice.equalsIgnoreCase("International")) {
            cuisine = new International();
        } else {
            System.out.println("Invalid cuisine choice.");
            sc.close();
            return;
        }

        System.out.print("Enter menu type (starter/maincourse/dessert): ");
        String menuType = sc.next();

        String[] menus = cuisine.showMenus(menuType);
        System.out.println("\nHere is your " + menuType + " menu:");
        for (String item : menus) {
            System.out.println("- " + item);
        }

        sc.close();

	}

}
