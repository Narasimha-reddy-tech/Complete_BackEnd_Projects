package com.exceptional_handling_examples;

//6.Write a java program for single try multi catch Example.


public class Exercise_6 {

	
	public static void main(String[] args) {
		try {
		int arr[]=new int[5];
		 arr[4]=10/2;
		String str="123";
		Integer.parseInt(str,str.length());
		
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arraybound error");
		}
		catch(NullPointerException e) {
			System.out.println("nullpointer error");
		}
		catch(NumberFormatException e) {
			System.out.println("number error");
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("always executed");
		}
		
	}
}
