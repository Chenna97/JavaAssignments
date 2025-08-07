package com.training.quest1;

public class StudentCourses implements Institute {

	@Override
	public String[] showCourses() {
		
		//return an array of courses as(python, java, angular, spring)
		
		return new String[] {"python", "java", "angular", "spring"};
		
	}
	
	

}
