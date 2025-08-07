package com.training.ipractice;

public class Main {

	public static void main(String[] args) {
		
		ICalculator icalculator = new BasicCalculator();
		
		icalculator .add(2, 2);
		icalculator.multiply(10, 10);
		
	IScientificCalculator	isCalculator = new ScientificCal();
		
	isCalculator.squrt(16);
	isCalculator.cube(3);
	isCalculator.add(4, 4);
	isCalculator.multiply(4, 4);

	}

}
