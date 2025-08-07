package com.training.quest6;

public class International implements ICuisine {

	@Override
	public String[] showMenus(String type) {
		if (type.toLowerCase().equals("starter")) {
			return new String[] { "Caesar Salad", "Bruschetta", "Garlic Bread" };
		}
		else if (type.toLowerCase().equals("desserts")) {
			return new String[] { "Spaghetti Carbonara", "Grilled Chicken", "Sushi" };
		}
		else if (type.toLowerCase().equals("maincourse")) {
			return new String[] { "Tiramisu", "Cheesecake", "Macarons" };
		}
		else
			return new String[] { "Invalid menu type. Please choose starters, maincourse or desserts." };

	}

}
