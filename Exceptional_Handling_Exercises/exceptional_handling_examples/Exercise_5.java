package com.exceptional_handling_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

//5.Write a Java program that reads an integer from the user but handles the 
//"InputMismatchException" if the input is not a valid integer.

public class Exercise_5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		try {                                               // enter float or string to get result
		int age=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println(e);
			System.out.println("enter correct integer");
		}
		finally {
			System.out.println("always executed");
		}
		
		


	}
}
