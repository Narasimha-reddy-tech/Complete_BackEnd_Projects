package com.pizza.model;

public class Pizza {

	
	private String pizzaName;
	private String pizzaType;
	private int pizzaPrice;
	private String pizzaDeliveryAddress;
	
	
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
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getPizzaDeliveryAddress() {
		return pizzaDeliveryAddress;
	}
	public void setPizzaDeliveryAddress(String pizzaDeliveryAddress) {
		this.pizzaDeliveryAddress = pizzaDeliveryAddress;
	}
	
	
	public Pizza() {
		super();
		
	}
	
	
	public Pizza(String pizzaName, String pizzaType, int pizzaPrice, String pizzaDeliveryAddress) {
		super();
		this.pizzaName = pizzaName;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		this.pizzaDeliveryAddress = pizzaDeliveryAddress;
	}
	
	
	@Override
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", pizzaDeliveryAddress=" + pizzaDeliveryAddress + "]";
	}
	
	
}
