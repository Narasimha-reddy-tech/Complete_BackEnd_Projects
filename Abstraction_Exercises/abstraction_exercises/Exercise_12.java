package com.abstraction_exercises;

//Exercise 12: Interface with Multiple Inheritance
//
//Create two interfaces, Flyable and Swimmable, with abstract methods fly() and swim(),
//respectively. Implement both interfaces in a class called Duck that provides implementations
//for both fly() and swim(). Create an instance of the Duck class and demonstrate its ability to both fly and swim.

interface Flyable{
	
	public void fly();
}

interface Swimmable{
	
	public void swim();
}

class Duck implements Flyable,Swimmable {

	@Override
	public void swim() {
		System.out.println("Duck is flying");
		
	}

	@Override
	public void fly() {
		System.out.println("Duck is swimming");
		
	}
	
}


public class Exercise_12 {

	public static void main(String[] args) {
		
		Duck du=new Duck();
		du.fly();
		du.swim();
		
	}
}
