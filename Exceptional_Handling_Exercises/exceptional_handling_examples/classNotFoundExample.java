package com.exceptional_handling_examples;

//8.write a java program with class not found exception.


public class classNotFoundExample {

	public static void main(String[] args) {
		
		 try {
	            
	            Class<?> cls = Class.forName("com.example.NonExistentClass");
	            System.out.println("Class found: " + cls.getName());                       
	        } catch (ClassNotFoundException e) {
	           
	            System.out.println("Caught ClassNotFoundException: " + e);
	        }

	        System.out.println("Program continues after exception handling.");  
		
	}
}
