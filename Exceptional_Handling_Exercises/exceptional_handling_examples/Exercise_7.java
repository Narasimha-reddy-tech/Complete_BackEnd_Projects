package com.exceptional_handling_examples;

//7.write a java program for nested try Block.

public class Exercise_7 {

	
	public static void main(String[] args) {
		
		try {
			System.out.println("outer block");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			int num=10/0;
			System.out.println("inner block");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int arr[]=new int[5];
			arr[6]=52;
			System.out.println("array block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}
}
