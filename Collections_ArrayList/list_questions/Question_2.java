package com.list_questions;

import java.util.ArrayList;

public class Question_2 {

	
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList();
		
		al.add("rama");
		al.add("sita");                           
		al.add("lakshmana");
		al.add("garuda");
		al.add("hanuman");
		al.add("bishma");
		al.add("rangule");
		al.add("rakshak");
		
		System.out.println(al.size());
		al.trimToSize();                                // Trim to size method
		System.out.println(al.size());
		
		
	}
}
