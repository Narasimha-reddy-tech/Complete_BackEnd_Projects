package com.list_questions;

import java.util.ArrayList;

public class Question_11 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		
		al.add("printer");
		al.add("drive");
		al.add("monitor");
		al.add("laptop");
		al.add("mouse");
		
		System.out.println(al);
		
		System.out.println("print using index of element");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
