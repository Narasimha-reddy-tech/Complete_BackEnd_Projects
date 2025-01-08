package com.pizza.service;

import java.util.Map.Entry;
import java.util.Set;

import com.pizza.dao.PizzaDaoImpl;
import com.pizza.model.Pizza;

public class PizzaServiceImpl implements PizzaService{

	PizzaDaoImpl pdao=new PizzaDaoImpl();
	
	@Override
	public int addPizza(Pizza piz) {
		
		return pdao.addPizza(piz);
	}

	@Override
	public Pizza updatePizza(int pizzaId, Pizza piz) {
		
		return pdao.updatePizza(pizzaId, piz);
	}

	@Override
	public Pizza getPizza(int pizzaId) {
		
		return pdao.getPizza(pizzaId);
	}

	@Override
	public String deletePizza(int pizzaId) {
		
		return pdao.deletePizza(pizzaId);
	}

	@Override
	public Set<Entry<Integer, Pizza>> getAllPizza() {
          
		return pdao.getAllPizza();
	}

}
