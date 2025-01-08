package com.list_questions;

import java.util.ArrayList;
import java.util.List;

public class Question_7 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("red");
		al.add("green");
		al.add("yellow");
		al.add("blue");
		al.add("orange");
		
		System.out.println("original :"+al);
		
		System.out.println("List of three elements :"+al.subList(0, 3));
	}
}
