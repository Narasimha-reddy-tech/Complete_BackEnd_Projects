package com.exceptional_handling_examples;

//4.Write a Java program that attempts to access a method or property
//of an object that is null and handles the "NullPointerException."


public class Example_4 {

	
	public static void main(String[] args) {
		
		String a=null;
		try {
		System.out.println("length of string is :"+a.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("always executed");
		}
		
		
	}
}
