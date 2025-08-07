package com.training.quest6;

public class Indian implements ICuisine {

	@Override
	public String[] showMenus(String type) {

		if (type.toLowerCase().equals("starter")) {
			return new String[] { "Caesar Salad", "Bruschetta", "Garlic Bread" };
		} else if (type.toLowerCase().equals("desserts")) {
			return new String[] { "Samosa", "Paneer Tikka", "Aloo Chaat" };

		} else if (type.toLowerCase().equals("maincourse")) {
			return new String[] { "Butter Chicken", "Palak Paneer", "Dal Makhani" };
		} else
			return new String[] { "Invalid menu type. Please choose starters, maincourse or desserts." };

	}

}
