package com.list_questions;

import java.util.ArrayList;
import java.util.List;

public class Question_20 {

	public static void main(String[] args) {
		
		List<String> list_Col = new ArrayList<String>();
		
		list_Col.add("Black");
		list_Col.add("Red");
		list_Col.add("Orange");
		list_Col.add("White");
		list_Col.add("Green");
		
		list_Col.set(1, "blue");
		list_Col.set(2, "pink");
		System.out.println(list_Col);
	}
}
