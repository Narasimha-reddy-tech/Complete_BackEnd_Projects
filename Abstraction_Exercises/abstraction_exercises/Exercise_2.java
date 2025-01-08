package com.abstraction_exercises;

//Exercise 2: Create an Interface
//
//Create an interface called Drawable with an abstract method draw().
//Then, create two classes, Circle and Rectangle,
//that implement the Drawable interface and provide their own draw() method implementations.

interface Drawable{
	
	public void draw();
}

class Circle2 implements Drawable{

	double radius;

	public Circle2(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		System.out.println("drawing a circle with radius :"+radius);
	}
	
}

class Rectangle2 implements Drawable{
   double length;
   double width;
   
public Rectangle2(double length, double width) {
	super();
	this.length = length;
	this.width = width;
}

@Override
public void draw() {
	System.out.println("drawing a rectangle with length :"+length+"and width :"+width);
	
}	
	
}

public class Exercise_2 {

	public static void main(String[] args) {
		
		Circle2 c2=new Circle2(5);
		c2.draw();
		
		Rectangle2 r2=new Rectangle2(4, 5);
		r2.draw();
		
	}
}
