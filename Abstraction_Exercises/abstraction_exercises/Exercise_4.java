package com.abstraction_exercises;

//Exercise 4: Interface with Constants
//
//Create an interface called Shape with two constant fields: PI and E.
//Implement this interface in a class called Circle and use the constants to calculate the circumference and area of a circle.


interface Shape2{
	
	 double PI=3.14;
	 double E=2.17;
	 
	 public double AreaOfCircle();
	 
	 public double CircumferenceOfCircle();
	
}
class Circle3 implements Shape2{

 double radius;
 
 public Circle3(double radius) {
	 super();
	 this.radius=radius;
 }
 
 public double AreaOfCircle() {
	 return PI*radius*radius;
 }
 
 public double CircumferenceOfCircle() {
	 return 2*PI*radius;
 }
 
	
}


public class Exercise_4 {

	public static void main(String[] args) {
		
		Circle3 c3=new Circle3(4);
		System.out.println("area of a circle :"+c3.AreaOfCircle());
		System.out.println("circumference of a circle :"+c3.CircumferenceOfCircle());
		
		
	}
}
