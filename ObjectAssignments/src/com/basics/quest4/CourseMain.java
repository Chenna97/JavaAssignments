package com.basics.quest4;

public class CourseMain {

	public static void main(String[] args) {

 Training trainer = new Training();
 
 trainer.showTrainers("Rohan","Sathya");
 
 String[] courses = trainer.showCourses();
 System.out.println("List of course provided by Trainers are :: " );
 
 for(String course : courses) {
	 
	 
	 
	 
	 System.out.print (" " +course);
	 
 }
	
	System.out.println("");
	}

}
