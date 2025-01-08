package com.abstraction_exercises;

//Exercise 10: Abstract Class with Inheritance
//
//Create an abstract class Employee with fields name and salary,
//and an abstract method calculateBonus(). Create two subclasses, Manager and Developer,
//that extend the Employee class and provide their own implementations for the calculateBonus() method.
//Calculate and display the bonus for instances of both subclasses.

abstract class Employee10{
	
	String name;
	double salary;
	
	public Employee10(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	public abstract double calculateBonus();
}

class Manager10 extends Employee10{

	public Manager10(String name, double salary) {
		super(name, salary);
		
	}

	@Override
	public double calculateBonus() {
		return salary*0.2;
	
	}
}


class Developer10 extends Employee10{

	public Developer10(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		
		return salary*0.5;
	}
}
public class Exercise_10 {
	

	public static void main(String[] args) {
		
		Manager10 m10=new Manager10("laddu", 4000);
		System.out.println("bonus of laddu "+m10.calculateBonus());
		
		Developer10 d10=new Developer10("chotu", 4000);
		System.out.println("bonus of chotu "+d10.calculateBonus());
	}
}
