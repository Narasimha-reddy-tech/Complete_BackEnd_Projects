package com.pizza.controller;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.pizza.model.Pizza;
import com.pizza.service.PizzaService;
import com.pizza.service.PizzaServiceImpl;

public class Customer {

	public static void main(String[] args) {
		
		PizzaService service=new PizzaServiceImpl();
		
		
		try {
		while(true) {
		System.out.println("** Pizza Delivery Management System **");
		System.out.println("1.add pizza details");
		System.out.println("2.update pizza details");
		System.out.println("3.get pizza details");
		System.out.println("4.delete pizza details");
		System.out.println("5.get all pizza details");
		
		Scanner sc=new Scanner(System.in);
		int option =sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("enter pizza name");
			String pizzaName=sc.next();
			System.out.println("enter pizza type");
			String pizzaType=sc.next();
			System.out.println("pizza price");
			int pizzaPrice=sc.nextInt();
			System.out.println("pizza delivery address");
			String pizzaDeliveryAddress=sc.next();
			
			if(pizzaName.isEmpty() && pizzaType.isEmpty() && pizzaPrice<0 && pizzaDeliveryAddress.isEmpty()) {
				throw new InputMismatchException("enter a valid input");
			}
			
			Pizza piz=new Pizza(pizzaName, pizzaType, pizzaPrice, pizzaDeliveryAddress);
		int pizzaId=service.addPizza(piz);
		System.out.println("pizza added successfully !"+pizzaId);
			break;
		case 2:
			System.out.println("enter pizza id to update details");
			int pizza1=sc.nextInt();
			
			
						
			System.out.println("enter pizza name");
			String pizzaname=sc.next();
			System.out.println("enter pizza type");
			String pizzatype=sc.next();
			System.out.println("pizza price");
			int pizzaprice=sc.nextInt();
			System.out.println("pizza delivery address");
			String pizzadeliveryAddress=sc.next();
			
			Pizza updatePiz=new Pizza(pizzaname, pizzatype, pizzaprice, pizzadeliveryAddress);
			    service.updatePizza(pizza1, updatePiz);
			   
			   System.out.println("pizza updated successfully !"+pizza1);
			break;
		case 3:
			System.out.println("enter pizza id to get details");
			int pizza2=sc.nextInt();
			
			Pizza piz2=service.getPizza(pizza2);
			System.out.println(piz2);
			break;
		case 4:
			System.out.println("enter pizza id to get details");
			int pizza3=sc.nextInt();
			
			String msg=service.deletePizza(pizza3);
			System.out.println(msg);
			
			break;
		case 5:
			   Set<Entry<Integer,Pizza>> result=  service.getAllPizza();
			 Iterator<Entry<Integer,Pizza>> itr= result.iterator();
			 while(itr.hasNext()) {
				Entry<Integer,Pizza>finalResult= itr.next();
				System.out.println(finalResult.getKey()+ " " +finalResult.getValue());
			 }
			
			break;
		default :
			System.out.println("choose a valid option");
			break;
		}
		
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
