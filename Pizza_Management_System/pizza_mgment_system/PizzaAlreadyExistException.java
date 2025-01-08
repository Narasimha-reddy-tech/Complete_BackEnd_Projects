package com.pizza_mgment_system;

public class PizzaAlreadyExistException extends Exception{

	public PizzaAlreadyExistException(String message) {
		super(message);
	}
}
