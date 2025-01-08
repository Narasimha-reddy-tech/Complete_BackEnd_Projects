package com.list_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_5 {

	
	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.add("10");
		al1.add("20");
		al1.add("30");
		al1.add("40");
		al1.add("10");
		al1.add("50");
		
		System.out.println("array list 1 :"+al1);
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");
		al2.add("E");
		al2.add("F");
		
	  System.out.println("array list 2 :"+al2);
	  
	  System.out.println("copy array list 1 to 2");
	  
	  Collections.copy(al2,al1);
	  
	  System.out.println("list 1 :"+al1);
	  System.out.println("list 2 :"+al2);
		
		
	}
}
