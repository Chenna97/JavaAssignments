package com.training.quest3;

public class MenuMain {

	public static void main(String[] args) {
		
		IMenu imenuStarters  = (itens)-> {
			System.out.println("Starters Menu::");
			for (String item : itens) {
                System.out.print(" " + item);
            }
            System.out.println();
		};
		
		IMenu imenuMainCourse = (items) -> {
            System.out.println("Main Course Menu:");
            for (String item : items) {
                System.out.print(" " + item);
            }
            System.out.println();
        };

       
        IMenu imenuDesserts = (items) -> {
            System.out.println("Desserts Menu:");
            for (String item : items) {
                System.out.print(" " + item);
            }
            System.out.println();
        };
        
        String[] starterItems = {"Spring Rolls", "Garlic Bread", "Soup"};
        String[] mainCourseItems = {"Paneer Butter Masala", "Chicken Biryani", "Veg Pulao"};
        String[] dessertItems = {"Gulab Jamun", "Ice Cream", "Brownie"};

        
        imenuStarters.printMenu(starterItems);
        imenuMainCourse.printMenu(mainCourseItems);
        imenuDesserts.printMenu(dessertItems);
	}

}
