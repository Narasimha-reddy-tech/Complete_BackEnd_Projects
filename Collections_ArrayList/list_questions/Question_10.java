package com.list_questions;

import java.util.ArrayList;

public class Question_10 {

	public static void main(String[] args) {
		
		ArrayList<String> al1=new ArrayList();
		
		al1.add("laptop");
		al1.add("mouse");
		al1.add("monitor");
		al1.add("keyboard");
		
		System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("apple");
		al2.add("guava");
		al2.add("plum");
		al2.add("cherry");
		
		System.out.println(al2);
		
		ArrayList<String> al3=new ArrayList<String>();
		al3.addAll(al1);
		al3.addAll(al2);
		
		System.out.println(al3);
		
	}
}
