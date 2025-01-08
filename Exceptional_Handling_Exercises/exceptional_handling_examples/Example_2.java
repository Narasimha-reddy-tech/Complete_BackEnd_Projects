package com.exceptional_handling_examples;

//2.Write a Java program that attempts to access an element at an invalid index
//in an array and handles the "ArrayIndexOutOfBoundsException" that may occur.

public class Example_2 {

	public static void main(String[] args) {
		
		try {
		int arr[]=new int[5];
		arr[5]=20;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("always executed");
		}
		
		
	}
}
