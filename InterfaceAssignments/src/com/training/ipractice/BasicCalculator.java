package com.training.ipractice;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Add tow numbers :: "+(x+y));
		
	}

	@Override
	public void multiply(int x, int y) {
		
		System.out.println("Multiply tow numbers :: "+(x*y));
	}

}
