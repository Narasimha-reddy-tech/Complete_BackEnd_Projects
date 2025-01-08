package com.list_questions;

import java.util.ArrayList;
import java.util.List;

public class Question_13 {

	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("laptop");
		al.add("mouse");
		al.add("cpu");
		al.add("drive");
		al.add("monitor");
		al.add("printer");
		
		System.out.println(al);
		
		System.out.println("Element 1 :"+al.get(0));
		System.out.println("Element 2 :"+al.get(5));
	}
}
