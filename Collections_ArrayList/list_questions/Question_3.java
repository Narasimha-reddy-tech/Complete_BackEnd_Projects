package com.list_questions;

import java.util.ArrayList;

public class Question_3 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		al.add("rama");
		al.add("sita");
		al.add("lakshmana");
		al.add("garuda");
		al.add("hanuman");
		al.add("bishma");
		al.add("rangule");
		al.add("rakshak");

		ArrayList<String> cloned=(ArrayList<String>)al.clone();

		System.out.println(cloned);
		cloned.add("hello");            // to check it is cloned or not
		System.out.println(cloned);             



	}
}
