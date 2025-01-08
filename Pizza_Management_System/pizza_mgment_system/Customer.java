package com.pizza_mgment_system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Customer {

	public static void main(String[] args) {

		HashMap<Integer,Pizza>pizza =new HashMap();
		int pizzaId=20;
		Scanner sc=new Scanner(System.in);

		try {
		while(true) {
			System.out.println("** pizza management system **");
			System.out.println("1.Add pizza details");
			System.out.println("2.Update pizza details");
			System.out.println("3.Get pizza details");
			System.out.println("4.Delete pizza details");
			System.out.println("5.Get All pizza details");

			int option= sc.nextInt();
			switch(option) {
			case 1 :
				System.out.println("Adding pizza details");
				
				System.out.println("Enter pizza name");
				String pizzaName=sc.next();
				System.out.println("Enter pizza type");
				String pizzaType=sc.next();
				System.out.println("Enter pizza model");
				String pizzaModel=sc.next();
				
				if(pizzaName.isEmpty() || pizzaType.isEmpty() || pizzaType.isEmpty()) {
					throw new InvalidInputException("enter correct input");
				}
				
				if(pizza.containsKey(pizzaId)) {
					throw new PizzaAlreadyExistException("pizza already exists ");
				}
				
				Pizza p=new Pizza(pizzaName, pizzaType, pizzaModel);
				
				pizza.put(pizzaId++, p);
				System.out.println("pizza details added successfully ! with id :"+pizzaId);
				
				
				break;
			case 2 :
				System.out.println("Updating pizza details");
				
				System.out.println("Enter pizza Id to update");
				int pizzaId2=sc.nextInt();
				System.out.println("Enter pizza name");
				String pizzaname=sc.next();
				System.out.println("Enter pizza type");
				String pizzatype=sc.next();
				System.out.println("Enter pizza model");
				String pizzamodel=sc.next();
				
				Pizza updateDet=new Pizza(pizzaname, pizzatype, pizzamodel);
				
				pizza.put(pizzaId2, updateDet);
				
				System.out.println("pizza details updated successfully ! with id number :"+pizzaId);
				
				break;
			case 3 :
				System.out.println("Getting pizza details");
				System.out.println("Enter pizza id");
				int pz1=sc.nextInt();
				   Pizza pizObj= pizza.get(pz1);
				   System.out.println(pizObj);
				
				
				break;
			case 4 :
				System.out.println("Deleting pizza details");
				System.out.println("Enter pizza id");
				int pz2=sc.nextInt();
				
				    pizza.remove(pz2);
				    System.out.println("pizza removed successfully with id :"+pz2);
				
				
				break;
			case 5 :
				System.out.println("Getting all pizza details");
				
				// entryset
				
				Set<Entry<Integer,Pizza>> res=pizza.entrySet();
				
				if(res.isEmpty()) {
					throw new PizzaNotFoundException("pizza not found");
				}
				
				Iterator<Entry<Integer,Pizza>>itr=res.iterator();
				while(itr.hasNext()) {
					Entry<Integer,Pizza>finalResult=itr.next();
					System.out.println(finalResult);
				}
				
				break;
			default:
				System.out.println("Enter correct option");
				break;
			}
		}
	}
		catch(Exception e) {
			System.err.println("Error :"+e.getMessage());
		}
	}
	
}
