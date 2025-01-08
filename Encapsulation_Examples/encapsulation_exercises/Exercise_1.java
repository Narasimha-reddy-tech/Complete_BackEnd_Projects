package com.encapsulation_exercises;

//Exercise 1: Encapsulation with Getter and Setter
//
//Create a class called Person with private fields name, age, and email.
//Provide public getter and setter methods for each of these fields.

class Person{
	
	private String name;
	private int age;
	private String email;
	
	//getters and setters
	
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
}

public class Exercise_1 {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.setName("laddu");
		p.setAge(20);
		p.setEmail("haha@gmail.com");
		
		System.out.println(p);
		
	}
}
