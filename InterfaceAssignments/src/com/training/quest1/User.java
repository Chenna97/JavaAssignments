package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the user type as Student / Employee ");
		
		String choice= sc.next();
		
		Institute ins =null;
		
		switch(choice.toLowerCase()) {
		case "student":
			
			ins=new StudentCourses();
			
			String[] courses = ins.showCourses();
			
			for(String course :courses ) {
			
			System.out.println(" "+course);
			
		
		}
		break;
		
		case "employee":
			
			ins=new EmployeeCourses();
			
			String[] empCourses = ins.showCourses();
			
			for(String empCourse :empCourses ) {
			
			System.out.println(" "+empCourse);
			}
			break;
			
			default:
				System.out.println("Invalid Choice ");
		}
		
		sc.close();
	}
}