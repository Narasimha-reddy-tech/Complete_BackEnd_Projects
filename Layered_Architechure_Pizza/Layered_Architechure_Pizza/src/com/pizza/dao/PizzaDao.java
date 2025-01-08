package com.pizza.dao;

import java.util.Set;
import java.util.Map.Entry;

import com.pizza.model.Pizza;

public interface PizzaDao {

	
	int addPizza(Pizza piz);
	Pizza updatePizza(int pizzaId,Pizza piz);
	    Pizza  getPizza(int pizzaId);
	 String deletePizza(int pizzaId);
	Set<Entry<Integer,Pizza>> getAllPizza();
}
