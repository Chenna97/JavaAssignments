package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface IValidationService {
	public boolean validatePassword(String password) throws TooShortException, TooLongException; 
	public boolean validateUsername(String username) throws NameExistsException; 
	
}
