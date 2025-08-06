package com.inher.quest1;

public class TeamTwo extends Project {

	
	// override doTask - "Project implemented using Python"
@Override
	
	void doTask()
	{
		
		System.out.println("Project implemented using Python");
		
	}  
	
	
	 // create ownmethod as   
	String[] getTechStack(){
		
		return new String[] {"Java","Spring","Angular"};
	}
	
	
	
}
