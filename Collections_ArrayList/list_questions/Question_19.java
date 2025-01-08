package com.list_questions;

import java.util.ArrayList;
import java.util.Collections;

public class Question_19 {

	public static void main(String[] args) {
		
		ArrayList<String> list_col= new ArrayList<String>();
		list_col.add("Pink");
		list_col.add("Yellow");
		list_col.add("Black");
		list_col.add("White");
		list_col.add("Blue");
		list_col.add("Orange");
		
		System.out.println(list_col);
		System.out.println(list_col.isEmpty());
		list_col.removeAll(list_col);
		System.out.println(list_col.isEmpty());
	}
}
