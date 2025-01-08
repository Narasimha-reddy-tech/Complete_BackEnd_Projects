package com.list_questions;

import java.util.ArrayList;

public class Question_8 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>(3);
		
		al.add("c++");
		al.add("java");
		al.add("HTML");
		System.out.println(al);
		al.ensureCapacity(7);
		al.add("python");
		al.add("css");
		al.add("javaScript");
		al.add("react");
		System.out.println(al);
	}
}
