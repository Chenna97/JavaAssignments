package com.inher.quest1;

public class TeamOne extends Project {
	
	// override doTask - "Project implemented using Java" 
	@Override
	
	void doTask()
	{
		// print as “doing some project”
		System.out.println("Project implemented using Java");
		
	}  
	
	 // create own method as  void 
	void softwaresUsed(String...tools){ 
		
		
	 //Iterate through the tools and print it(eclipse. Jenkins, maven) 
		
		for(String tool : tools) {
			System.out.print(" " + tool);
		
	}
	
} 
	

}
