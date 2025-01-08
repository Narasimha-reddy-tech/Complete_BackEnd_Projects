package com.pizza.service;

import java.util.Map.Entry;
import java.util.Set;

import com.pizza.model.Pizza;

public interface PizzaService {

	
	int addPizza(Pizza piz);
	Pizza updatePizza(int pizzaId,Pizza piz);
	    Pizza  getPizza(int pizzaId);
	 String deletePizza(int pizzaId);
	Set<Entry<Integer,Pizza>> getAllPizza();
	
	
}
