package com.exceptional_handling_examples;

//1.Write a Java program that divides two numbers and handles the "ArithmeticException" that occurs when dividing by zero.

public class Example_1 {
	
	
	public static void main(String[] args) {
		
		
		int i=20;
		int j=0;
		try {
		int result=i/j;
		System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("always executed");
		}
		
	}
}
