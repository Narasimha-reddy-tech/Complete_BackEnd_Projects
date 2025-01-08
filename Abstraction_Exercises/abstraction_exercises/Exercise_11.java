package com.abstraction_exercises;

//Exercise 11: Abstract Class with Polymorphism
//
//Create an abstract class Shape with an abstract method calculateArea().
//Then, create three subclasses: Circle, Rectangle, and Triangle, each extending the Shape class.
//Implement the calculateArea() method in each subclass to calculate the area of their respective shapes.
//Create an array of Shape objects containing instances of these subclasses and calculate
//and display the area of each shape using polymorphism.

abstract class Shape11{
	
	public abstract double calculateArea();
}

class Circle11 extends Shape11{
	double radius;

	public Circle11(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	
}

class Rectangle11 extends Shape11{
	
	double length;
	double width;
	
	public Rectangle11(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return length*width;
	}
	
	
}

class Triangle11 extends Shape11{
	
	double sideA;
	double sideB;
	double sideC;
	
	public Triangle11(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double calculateArea() {
		double s=(sideA+sideB+sideC)/2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
	
	
	
	
}

public class Exercise_11 {

	
	public static void main(String[] args) {
		
		 Shape11[] shapes = new Shape11[3];
	        shapes[0] = new Circle11(5);      
	        shapes[1] = new Rectangle11(4, 6); 
	        shapes[2] = new Triangle11(3, 4, 5);
	        
	        for(Shape11 s:shapes) {
	        	System.out.println("area :"+s.calculateArea());
	        }
	}
}
