package com.training.ipractice;

public class ScientificCal extends BasicCalculator implements IScientificCalculator {

	@Override
	public void squrt(double x) {
		
		System.out.println("SquareRoot of X is :: "+Math.sqrt(x));
		
	}

	@Override
	public void cube(double x) {
		System.out.println("SquareRoot of X is :: "+ (x*x*x));
		
	}
	


}
