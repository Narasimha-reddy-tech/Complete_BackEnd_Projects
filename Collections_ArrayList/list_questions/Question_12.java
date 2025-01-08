package com.list_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_12 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("black");
		al.add("green");
		al.add("pink");
		al.add("yellow");
		al.add("red");
		al.add("white");
		
		Collections.sort(al);
		al.remove(4);
		Collections.sort(al);
		System.out.println(al);
	}
}
