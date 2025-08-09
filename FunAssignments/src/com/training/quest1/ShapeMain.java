package com.training.quest1;

public class ShapeMain {

	public static void main(String[] args) {
		
		IShape iShapeRectangle= (x,y)-> System.out.println("Rectangle Area: " + (x * y));
		iShapeRectangle.area(8, 6);
		
		IShape iShapeTriangle = (x,y)-> System.out.println("Triangle area :: " +(0.5*x*y));
		iShapeTriangle.area(6, 4);
		
		IShape iShapeSquare = (x,y)-> System.out.println("Square area :: " +(x*x));
		
		iShapeSquare.area(4,0);
	}

}
