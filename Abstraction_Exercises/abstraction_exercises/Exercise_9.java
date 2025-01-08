package com.abstraction_exercises;

//Exercise 9: Interface with Multiple Implementations
//
//Create an interface Shape with abstract methods calculateArea() and calculatePerimeter().
//Implement this interface in three classes: Circle, Rectangle, and Triangle.
//Each class should provide its own implementations for the methods.
//Calculate and display the area and perimeter of instances of these shapes.

interface Shape9{
	
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}

class Circle9 implements Shape9{
	double radius;

	public Circle9(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		
		return 2*Math.PI*radius;
	}
	
	
}
class Rectangle9 implements Shape9{
	
	double length;
	double width;
	
	public Rectangle9(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return length*width;
	}

	@Override
	public double calculatePerimeter() {
	
		return 2*(length+width);
	}
	
	
}
class Triange9 implements Shape9{
	
	double sideA;
	double sideB;
	double sideC;
	
	public Triange9(double sideA, double sideB, double sideC) {
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

	@Override
	public double calculatePerimeter() {
		
		return (sideA+sideB+sideC);
	}
	
}


public class Exercise_9 {

	public static void main(String[] args) {
		
		Circle9 c9=new Circle9(5);
		System.out.println("area of a circle is :"+c9.calculateArea());
		System.out.println("perimeter of a circle is :"+c9.calculatePerimeter());
		
		System.out.println();
		
		Rectangle9 r9 =new Rectangle9(4, 5);
		System.out.println("area of a rectangle is :"+r9.calculateArea());
		System.out.println("perimeter of a rectangle is :"+r9.calculatePerimeter());
		
		System.out.println();
		
		Triange9 t9=new Triange9(4, 5, 6);
		System.out.println("area of a triangle is :"+t9.calculateArea());
		System.out.println("perimeter of a triangle is :"+t9.calculatePerimeter());
	}
}
