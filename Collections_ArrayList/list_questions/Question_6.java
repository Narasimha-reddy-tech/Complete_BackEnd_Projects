package com.list_questions;

import java.util.ArrayList;
import java.util.Collections;

public class Question_6 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("monday");
		al.add("tuesday");
		al.add("wedday");
		al.add("thursday");
		al.add("friday");
		
		System.out.println("original :"+al); 
		 
		al.removeAll(al);
		System.out.println("array list after removing all elemnts :"+al);
		
		
	}
}
