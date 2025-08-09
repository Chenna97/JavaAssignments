package com.training.quest6;

import java.util.Arrays;

public class CourseMain {

	public static void main(String[] args) {
		
		
		ICourses iCourseFrontend =(type)->{
			if(type.equals("design")) {
				
				//If type is  “design” return an array of {html,css, Bootstrap, material}
				
				return new String[] {"html","css","Bootstrap"};
				
			}
			else if (type.equals("development"))
			{
			//type is  “development” return an array of {html,css, react, angular} 
			
				return new String[] {"html","css","react","angular"};
			}
			else
				//return an array of no courses available
				return  new String[] {"No Courses available"};
		};
		
		ICourses iCourseBackend  = (type)->
		{
			//If type is  “java” return an array of {Spring,Hibernate} 
			if(type.equals("java")){
				return new String[] {"Spring","Hibernate"};
			}
			// If type is  “python” return an array of {Django,Flask} 
			else if(type.equals("python")) {
				return new String[] {"Django","Flask"};
			}
			//else return an array of no courses available 
			else {
				return  new String[] {"No Courses available"};	
			}
				
		};
		//In database implementation
		ICourses iCourseDatabase  = (type)->{
//			 If type is  “sql” return an array of {MySQL,Oracle}
			if(type.equals("sql")){
				return new String[] {"MySQL","Oracle"};
			}
//		 If type is  “nosql” return an array of {MongoDB,CouchDB} 
			else if(type.equals("nosql")) {
				return new String[] {"MongoDB","CouchDB"};
			}
			
//		else return an array of no courses available 
			else {
				return  new String[] {"No Courses available"};	
			}
				
		};
		
		
		System.out.println("Frontend - Design: " + Arrays.toString(iCourseFrontend.printCourses("design")));
        System.out.println("Frontend - Development: " + Arrays.toString(iCourseFrontend.printCourses("development")));
        System.out.println("Frontend - Other: " + Arrays.toString(iCourseFrontend.printCourses("other")));

        System.out.println("Backend - Java: " + Arrays.toString(iCourseBackend.printCourses("java")));
        System.out.println("Backend - Python: " + Arrays.toString(iCourseBackend.printCourses("python")));
        System.out.println("Backend - Other: " + Arrays.toString(iCourseBackend.printCourses("php")));

        System.out.println("Database - SQL: " + Arrays.toString(iCourseDatabase.printCourses("sql")));
        System.out.println("Database - NoSQL: " + Arrays.toString(iCourseDatabase.printCourses("nosql")));
        System.out.println("Database - Other: " + Arrays.toString(iCourseDatabase.printCourses("graphdb")));
        
        ;
	}

}
