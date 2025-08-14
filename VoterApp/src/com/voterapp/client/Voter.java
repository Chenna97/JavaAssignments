package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

public class Voter {

	public static void main(String[] args) {
		System.out.println("Voter Details :: ");
		Scanner sc= new Scanner(System.in);
		IElectionBoothService boothService = new ElectionBoothServiceImpl();

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
           

            System.out.print("Enter your locality: ");
            String locality = sc.next();

            System.out.print("Enter your voter ID: ");
            int voterId = sc.nextInt();

            boolean eligible = boothService.checkEligibility(age, locality, voterId);
            if (eligible) {
                System.out.println("You are eligible to vote.");
            }

        } catch (UnderAgeException e) {   
            System.out.println( e.getMessage());
        } catch (LocalityNotFoundException e) {
            System.out.println( e.getMessage());
        } catch (InvalidVoterIDException e) {
            System.out.println( e.getMessage());
        } catch (NotEligibleException e) {
            System.out.println("Undefined error not eligible :: ");
        } finally {
            sc.close();
        }
 
	}

}
