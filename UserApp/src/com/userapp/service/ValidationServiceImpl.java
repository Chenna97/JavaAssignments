package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		//If password length is less than 6 , then throw TooShortException 
		if(password.length()<6) {
			throw new TooShortException("password length is less than 6");
		}
		  // If password length is greater than 15 , then throw TooLongException
		if(password.length()>15)
		{
			throw new TooLongException("password length is greater than 15");
		}
		  else return true; 
		
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames = {"Sri”","Priya","Joe","Kathy"} ;
		//Iterate through the array using forEach 
		
		for(String username1 : usernames) {
			//If name exists in array, then throw NameExistsException(“Name already exists”) 
			
			if(username1.equals(username)) {
				
				throw new NameExistsException("Name already exists");
			}
			
		}
		 
			 return true;
		
	}

}
