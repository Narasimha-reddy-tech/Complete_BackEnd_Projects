package com.list_questions;

import java.util.ArrayList;
import java.util.List;

public class Question_15 {

	
	public static void main(String[] args) {
		
		List<String> list_col = new ArrayList<String>();
		list_col.add("Black");
		list_col.add("Orange");
		list_col.add("Pink");
		list_col.add("Blue");
		list_col.add("White");
		list_col.add("Yellow");	
		list_col.add("Purple");
		
		if(list_col.contains("Black")) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
	}
}
