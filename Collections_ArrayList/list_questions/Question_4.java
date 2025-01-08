package com.list_questions;

// comparing 2 array lists ?

import java.util.ArrayList;

public class Question_4 {

	private static final String True = null;
	private static final String False = null;

	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList();                   
		
		al1.add("Rama");
		al1.add("sita");
		al1.add("lakshmana");
		al1.add("hanuman");
		
		ArrayList <String> al2=new ArrayList<String>();
	
		al2.add("Rama");
		al2.add("sita");
		al2.add("lakshmana");
		
		System.out.println("array list 1 :"+al1);
		System.out.println("array list 2 :"+al2);
		
		// comparing strings 1 and 2
		
		ArrayList<String> al3=new ArrayList<String>();
		
		for(String e:al1)
		al3.add(al2.contains(e)? "True" : "False" );        
		System.out.println("comparing 1 and 2 :"+al3);      
		
		
		
		
	}
}
