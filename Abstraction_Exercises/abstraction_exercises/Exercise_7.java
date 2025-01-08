package com.abstraction_exercises;

//Exercise 7: Abstract Class with Constructors
//
//Create an abstract class Vehicle with fields make and model.
//Add a constructor to initialize these fields. Create two subclasses,
//Car and Motorcycle, that extend the Vehicle class and provide their own constructors. 
//Display the make and model of instances of both subclasses.

abstract class Vehicle2{
	
	String make;
	String model;
	
	public Vehicle2(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
	public abstract void display();
	
}

class Car2 extends Vehicle2{

	public Car2(String make, String model) {
		super(make, model);
	}

	@Override
	public void display() {
	System.out.println("car make :"+make +" "+"model :"+model);
		
	}
	
	
	
}
class MotorCycle2 extends Vehicle2{

	public MotorCycle2(String make, String model) {
		super(make, model);
	}

	@Override
	public void display() {
		System.out.println("motorCycle make :"+make +" "+"model :"+model);
		
	}
	
	
}

public class Exercise_7 {

	public static void main(String[] args) {
		
		Car2 c2=new Car2("mahindra", "thar");
		c2.display();
		
		MotorCycle2 m2=new MotorCycle2("royalEnfield", "classic 350");
		m2.display();
	}
}
