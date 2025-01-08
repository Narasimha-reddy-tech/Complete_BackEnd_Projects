package com.encapsulation_exercises;

//Exercise 6: Using Encapsulation with Validation
//
//Modify the Main class to create an instance of the Person class and set its attributes,
//including invalid values. Observe that the validation in the setter methods prevents setting invalid values.

class Person6{
	
	private String name;
	private int age;
	
	public Person6(String name, int age) {
		super();
		this.name = name;
		this.age = age;
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name==null || name.isEmpty()) {
			System.out.println("name is invalid ,enter the correct fields");
		}
		else {
			this.name = name;
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0 || age<=120) {
			this.age = age;
		}
		else {
			System.out.println("age is invalid , enter the correct fields");
		}
	}
	
}

public class Exercise_6 {

	
	public static void main(String[] args) {
		
		Person6 p6=new Person6("laddu", 20);
		System.out.println(p6.getName());
		System.out.println(p6.getAge());
		
		//modification
		
		p6.setName("chotu");
		p6.setAge(22);
		System.out.println(p6.getName());
		System.out.println(p6.getAge());
		
		
		
		
	}
}
