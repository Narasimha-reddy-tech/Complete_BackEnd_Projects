package com.abstraction_exercises;

//Exercise 3: Abstract Class with Fields
//
//Create an abstract class called Animal with two fields: name and sound. 
//Add a constructor to initialize these fields. Create two subclasses, Dog and Cat,
//that extend the Animal class and provide their own implementations for the makeSound() method.
//Exercise 4: Interface with Constants

abstract class Animal{
	
	String name;
	String sound;
	
	public Animal(String name,String sound) {
		this.name=name;
		this.sound=sound;
	}
	
	public abstract void makeSound();
	
}
class Dog extends Animal{
	
	
	
	public Dog(String name, String sound) {
		super(name, sound);
	}

	@Override
	public void makeSound() {
		System.out.println(name+" " +"makes sound :"+sound);
	}
}

class Cat extends Animal{
	
	public Cat(String name,String sound) {
		super(name,sound);
	}

	@Override
	public void makeSound() {
		System.out.println(name+ " " +"makes sound :"+sound);
		
	}
	
	
}
public class Exercise_3 {

	
	public static void main(String[] args) {
		
		Dog d=new Dog("raju", "bow");
		d.makeSound();
		
		Cat c=new Cat("chotu", "meow");
		c.makeSound();
	}
}
