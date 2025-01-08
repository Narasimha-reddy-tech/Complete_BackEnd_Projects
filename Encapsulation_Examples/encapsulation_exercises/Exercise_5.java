package com.encapsulation_exercises;

//Exercise 5: Encapsulation with Validation
//
//Enhance the Person class to include validation in the setter methods.
//The setAge() method should ensure that the age is within a reasonable range
//(e.g., between 0 and 120), and the setEmail() method should validate that the 
//email is in a valid format (e.g., contains "@" and "." symbols).

class Person5{
	
	private int age;
	private String email;
	
	public Person5(int age, String email) {
		super();
		this.age = age;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age>=0 && age<=120) {
			this.age = age;
		}
		else {
			
			System.out.println("enter corrrect age");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email.contains("@") && email.contains(".")) {
			this.email = email;
		}
		else {
			System.out.println("enter email containg @ and .");
		}
	}
	
}

public class Exercise_5 {

	public static void main(String[] args) {
		
		Person5 p5=new Person5(20, "hello@gmail.com");
		System.out.println("age :"+p5.getAge());
		System.out.println("email :"+p5.getEmail());
		
          //modifying values
		
		p5.setAge(22);
		p5.setEmail("hi@gmail.com");
		
		System.out.println(p5.getAge());
		System.out.println(p5.getEmail());
		
		//updating again
		
		p5.setAge(-5);
		p5.setEmail("hello");
		
		System.out.println(p5.getAge());
		System.out.println(p5.getEmail());
		
	}
}
