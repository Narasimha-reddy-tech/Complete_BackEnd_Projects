package com.exceptional_handling_examples;

//9.write a java program for IlligalArgument Exception.

public class Exercise_9 {
	
	public void display(int age) {
		if(age<0) {
			throw new IllegalArgumentException("age should not be below 0");
		}
		else if(age>150) {
			throw new IllegalArgumentException("agen should not be above 150");
		}
		else {
			System.out.println("valid");
		}
	}

	public static void main(String[] args) {
		Exercise_9 e9=new Exercise_9();
		try {
		e9.display(-5);
		e9.display(5);
		e9.display(160);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
