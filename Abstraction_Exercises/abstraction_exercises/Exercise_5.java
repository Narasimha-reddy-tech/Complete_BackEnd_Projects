package com.abstraction_exercises;

//Exercise 5: Abstract Class with Template Method
//
//Create an abstract class Meal with a template method prepareMeal(). 
//The prepareMeal() method defines the high-level steps for preparing a meal,
//such as cooking, plating, and serving. Create two concrete subclasses,
//Breakfast and Lunch, that extend the Meal class and implement their own versions of prepareMeal().


abstract class Meal{
	
	public  void prepareMeal() {
		cook();
		plate();
		serve();
	}
	
	abstract void cook();
	abstract void plate();
	abstract void serve();
	
}

class Breakfast extends Meal{
	
	void cook() {
		System.out.println("idly,dosa,puri");
	}
	void plate() {
		System.out.println("idly,dosa,chapathi");
	}
	void serve() {
		System.out.println("idly,dosa,sambar");
	}
	
}

class Lunch extends Meal{
	
	void cook() {
		System.out.println("rice,dal");
	}
	void plate() {
		System.out.println("chapati,dal");
	}
	void serve() {
		System.out.println("puri,dal");
	}
}


public class Exercise_5 {

	public static void main(String[] args) {
		
		Breakfast b=new Breakfast();
		b.prepareMeal();
		
		Lunch l=new Lunch();
		l.prepareMeal();
	}
}
