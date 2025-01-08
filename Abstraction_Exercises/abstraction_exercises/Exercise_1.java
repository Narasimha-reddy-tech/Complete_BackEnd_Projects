package com.abstraction_exercises;

//Create an abstract class called Shape with an abstract method calculateArea().
//Then, create two subclasses, Circle and Rectangle, that extend the Shape class and implement the calculateArea() 
//method to calculate the area of a circle and a rectangle, respectively.


abstract class Shape{
	
	public abstract void calculateArea();
}

class Circle extends Shape{

	@Override
	public void calculateArea() {
		int radius=2;
		System.out.println(" area of circle :"+(Math.PI*radius*radius));
		
	}
	
}

class Rectangle extends Shape{

	@Override
	public void calculateArea() {
		int l=4;
		int b=5;
		System.out.println("area of ractangle "+(l*b));
		
	}
	
	
}

public class Exercise_1 {

	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.calculateArea();
		
		Rectangle r=new Rectangle();
		r.calculateArea();
		
	}
}
