package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        return checkAge(age) && checkLocality(locality) && checkVoterId(vid);
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("You must be 18 or older to vote.");
        }
        return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] validLocalities = {"JP Nagar", "ABC Nagar", "whitefield"};
        for (String loc : validLocalities) {
            if (loc.equalsIgnoreCase(locality)) {
                return true;
            }
        }
        throw new LocalityNotFoundException("Locality not found: " + locality);
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if (voterId < 1000 || voterId > 9999) {
            throw new InvalidVoterIDException("Voter ID must be between 1000 and 9999.");
        }
        return true;
    }
}
