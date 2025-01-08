package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("narasimha");
		EntityManager entity= factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Employee emp1=new Employee(10, "ballala", 2000, "hyd");
		Employee emp2=new Employee(20, "baahu", 2500, "goa");
		Employee emp3=new Employee(30, "kalakeya", 3000, "bali");
		Employee emp4=new Employee(40, "kattappa", 3500, "delhi");
		Employee emp5=new Employee(50, "devasena", 1200, "mumbai");
		
//		entity.persist(emp1);
//		entity.persist(emp2);
//		entity.persist(emp3);
//		entity.persist(emp4);
//		entity.persist(emp5);
	
		// fetching All employee data
		
		      Query nq= entity.createNamedQuery("Employee.getAllEmployees");
		       List<Employee> li= nq.getResultList();
		       
		       for(Employee all:li) {
		    	   System.out.println("Employee :"+all);
		       }
		      
//		       allEmployees.forEach(emp -> System.out.println("Employee :"+emp));  Not working like this
		       
		       // fetching employee names in upper case
		       
		       Query nq1=entity.createNamedQuery("Employee.getEmployeeUpperCase");
		       List<String> li1=nq1.getResultList();
		       
		       for(String upper :li1) {
		    	   System.out.println("Employee name :"+upper);
		       }
		       
		       // fetching employees starts with letter b
		       
		       Query nq2=entity.createNamedQuery("Employee.getEmployeeWithNameLike")
		    		   .setParameter("pattern", "b%");
		             
		       List<Employee> li2=nq2.getResultList();
		       
		       for(Employee starts:li2) {
		    	   System.out.println("Employee with b :"+starts.getEmpname());
		       }
		       
		      
		       
		       // fetching employee with maxSalary
		       
		       Query nq3=entity.createNamedQuery("Employee.getEmployeeMaxSalary");
		             int max= (int) nq3.getSingleResult();
		             System.out.println("max salary :"+max);
		             
		             // fetching employee salary between 2500 and 3000
		             
		             Query nq4=entity.createNamedQuery("Employee.getEmployeeSalaryBetween")
		            		 .setParameter("Low", 2500)
		            		 .setParameter("High", 3000);
		            List<Employee>li4= nq4.getResultList();
		            for(Employee between :li4) {
		            	System.out.println("salary b/w 2500 and 3000 :"+between.getEmpsal());
		            }
		            
		            // fetching empsal <2500 and adding +5000
//		            
		            Query nq5=entity.createNamedQuery("Employee.getEmployeeSalaryAndAdd")
		            		.setParameter("increment", 5000)
		            		.setParameter("threshold", 2500);
		               int updateSal=  nq5.executeUpdate();
		               System.out.println("Employee :"+updateSal);
		               
		               // fetching data in ascending order
		               
		               Query nq6=entity.createNamedQuery("Employee.getEmployeeAscendingOrder");
		                  List<Employee> li6=nq6.getResultList();
		                  for(Employee asc:li6) {
		                	  System.out.println("Employee :"+asc.getEmpname());
		                  }
		                           
		
		entity.getTransaction().commit();
	}
}
