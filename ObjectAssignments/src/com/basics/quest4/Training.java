package com.basics.quest4;

public class Training {
	
	
	String[] showCourses() {
	
		System.out.println("Array of courses names : ");
		
		return new String[] {"Java","Python","GenericAI"};
		
		
	}
	
	 void showTrainers(String...names ) {
		
		 for(String name : names) {
			 
			 System.out.println("Trainer names are : "+ name);
		 }
		 
		 
	 }

}
