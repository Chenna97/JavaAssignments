package com.training.quest2;

public class CalcMain {

	public static void main(String[] args) {
		
		ICalculator iCalculatorSum = (x,y)-> System.out.println("Sum of Two Niumbers x and y is :: "+(x+y));
		iCalculatorSum.calculate(15.0, 15.0);
		
		ICalculator iCalculatorProduct = (x,y)-> System.out.println("Product of Two Niumbers x and y is :: "+(x*y));
		iCalculatorProduct.calculate(25.0, 15.0);
		
		ICalculator iCalculatorSqurt = (x,y)-> System.out.println("SquareRoot of  x  is :: "+Math.sqrt(x)+ " and Square root of y is ::"+ Math.sqrt(y));
		iCalculatorSqurt.calculate(25.0,16.0);
		
		ICalculator iCalculatorCube = (x,y)-> System.out.println("Cube of Two Niumbers x and y is :: "+Math.pow(x, y));
		iCalculatorCube.calculate(3.0,3.0);
	}

}
