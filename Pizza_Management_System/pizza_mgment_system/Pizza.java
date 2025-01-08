package com.pizza_mgment_system;

public class Pizza {

	private String pizzaName;
	private String pizzaType;
	private String pizzaModel;
	
	
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getPizzaModel() {
		return pizzaModel;
	}
	public void setPizzaModel(String pizzaModel) {
		this.pizzaModel = pizzaModel;
	}
	
	public Pizza() {
		super();
		
	}
	
	public Pizza(String pizzaName, String pizzaType, String pizzaModel) {
		super();
		this.pizzaName = pizzaName;
		this.pizzaType = pizzaType;
		this.pizzaModel = pizzaModel;
	}
	
	@Override
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", pizzaType=" + pizzaType + ", pizzaModel=" + pizzaModel + "]";
	}
	
	
}
