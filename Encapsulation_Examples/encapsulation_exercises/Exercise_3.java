package com.encapsulation_exercises;

//Exercise 3: Encapsulation with Constructors
//
//Modify the Person class to include a constructor that accepts parameters for name, age, and email.
//Use this constructor to initialize the fields when an object of the Person class is created.


class Person3{
	
   private String name="hello";
   private int age=22;
   private String email="hi@gmail.com";
   
public Person3(String name, int age, String email) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
   
   
}

public class Exercise_3 {

	public static void main(String[] args) {
		
		Person3 p3= new Person3("laddu", 20, "hello@gmail.com");
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println(p3.getEmail());
	}
}
