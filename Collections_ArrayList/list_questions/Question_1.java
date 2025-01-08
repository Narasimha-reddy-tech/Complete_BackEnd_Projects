package com.list_questions;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some elements and print out the collection

public class Question_1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("hello");                                         // till now collections used for :copy,sort,reverse,shuffle
		al.add(20);
		al.add(null);
		al.add(true);
		al.add(22.55);
		
		System.out.println(al);
	}
	
}
