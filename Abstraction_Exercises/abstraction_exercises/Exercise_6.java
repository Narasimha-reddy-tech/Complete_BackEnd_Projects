package com.abstraction_exercises;

//Exercise 6: Interface with Default Methods
//
//Create an interface Vehicle with two abstract methods, start() and stop().
//Add a default method honk() to the interface. Implement this interface in two classes,
//Car and Motorcycle, providing their own implementations for start() and stop(). Call the honk() method on instances of both classes.


interface Vehicle{
	
	public abstract void start();
	public abstract void stop();
	
	  default void  honk() {
		  System.out.println("vehicle is honking");
	  }
}
class Car implements Vehicle{
	
	public void start() {
		System.out.println("car is starting");
	}
	
	public void stop() {
		System.out.println("car is stoping");
	}
}
class MotorCycle implements Vehicle{
	
	public void start() {
		System.out.println("motorCycle is starting");
	}
	
	public void stop() {
		System.out.println("motorCycle is stoping");
	}
}

public class Exercise_6 {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.start();
		c.stop();
		c.honk();
		
		System.out.println();
		
		MotorCycle mc=new MotorCycle();
		mc.start();
		mc.stop();
		mc.honk();
	}
}
