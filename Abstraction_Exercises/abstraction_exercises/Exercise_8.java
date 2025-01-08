package com.abstraction_exercises;

//Exercise 8: Interface with Static Method
//
//Create an interface MathOperations with an abstract method calculate(int a, int b)
//for performing a mathematical operation. Add a static method square(int a) 
//to the interface to calculate the square of a number. Implement this interface
//in a class Calculator and provide an implementation for the calculate() method.
//Use the static square() method to calculate the square of a number.

interface MathOperations{
	
	public abstract void calculate(int a,int b);
	
	 static int square(int a) {
		 return a*a;
	 }
}

class Calculator{
	
	public int calculate(int a,int b) {
		return a+b;
	}
	
	public int calculateSquare(int a) {
		return MathOperations.square(a);
	}
	
}

public class Exercise_8 {

	public static void main(String[] args) {
		
		Calculator ca=new Calculator();
		System.out.println("addition of a and b is :"+ca.calculate(5, 4));
		System.out.println("square of a is:"+ca.calculateSquare(5));
		
	}
}
