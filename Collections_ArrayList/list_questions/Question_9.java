package com.list_questions;

import java.util.ArrayList;
import java.util.List;

public class Question_9 {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Banana");
		al.add("Cherry");
		al.add("Guava");
		al.add("plum");
		
		System.out.println(al);
		
		al.add(0,"papaya");
		al.add(5,"Pineapple");
		
		System.out.println(al);
	   
	}
}
