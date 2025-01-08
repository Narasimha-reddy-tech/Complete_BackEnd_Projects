package com.exceptional_handling_examples;

import java.io.File;
import java.io.FileNotFoundException;
//3.Write a Java program that attempts to open a file that does not exist and handles the "FileNotFoundException."
import java.util.Scanner;

public class Exception_3 {

public static void main(String[] args) {
	
File file =new File("file_file.txt");
	
	try {
		Scanner sc=new Scanner(file);
		System.out.println("file opened successfully");
		
	}
	catch(FileNotFoundException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("always executed");
	
	}
}
}
	
