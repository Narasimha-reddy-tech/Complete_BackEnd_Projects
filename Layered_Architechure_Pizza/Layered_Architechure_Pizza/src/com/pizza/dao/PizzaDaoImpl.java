package com.pizza.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.pizza.model.Pizza;

public class PizzaDaoImpl implements PizzaDao{

	HashMap<Integer,Pizza>pizza=new HashMap<Integer,Pizza>();
	int pizzaId=100;
	
	@Override
	public int addPizza(Pizza piz) {
	      pizza.put(pizzaId++, piz);
		return pizzaId;
	}

	@Override
	public Pizza updatePizza(int pizzaId, Pizza piz) {
		Pizza updatePizza=pizza.put(pizzaId, piz);
		return updatePizza;
	}

	@Override
	public Pizza getPizza(int pizzaId) {
		Pizza getPizza= pizza.get(pizzaId);
		return getPizza;
	}

	@Override
	public String deletePizza(int pizzaId) {
		pizza.remove(pizzaId);
		return "pizza deleted successfully !"+pizzaId;
	}

	@Override
	public Set<Entry<Integer, Pizza>> getAllPizza() {
		Set<Entry<Integer, Pizza>>result=pizza.entrySet();
		return result;
	}

}
