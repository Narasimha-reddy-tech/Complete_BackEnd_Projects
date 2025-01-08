package com.list_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_18 {

	
	public static void main(String[] args) {
		
		List<String> list_col = new ArrayList<String>();
		list_col.add("Black");
		list_col.add("Blue");    
		list_col.add("Green");
		list_col.add("Orange");
		list_col.add("Pink");
		list_col.add("Purple");
		list_col.add("White");
		list_col.add("Yellow");
		
		System.out.println("before swaping :"+list_col);
		
		Collections.swap(list_col, 1, 4);
		System.out.println("after swaping ---------------------");
		System.out.println(list_col);
	}
}
