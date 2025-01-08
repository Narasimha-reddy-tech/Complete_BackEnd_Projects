package com.jpa.demo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory=	Persistence.createEntityManagerFactory("narasimha");

		EntityManager entity=   factory.createEntityManager();

		entity.getTransaction().begin();


		Employee e1=new Employee(11,"salaar", 34344, "kansaar");
		Employee e2=new Employee(12,"syndicate", 6234, "national");
		Employee e3=new Employee(13,"baahubali", 2345, "mahishmathi");
		Employee e4=new Employee(14,"kalki", 56546, "complex");
		Employee e5=new Employee(15,"billa", 56356, "hyd");


		//          entity.persist(e1);
		//          entity.persist(e2);
		//          entity.persist(e3);
		//          entity.persist(e4);
		//          entity.persist(e5);


		// fetching data from database

		Query q= entity.createQuery("SELECT e FROM Employee e");
		List<Employee> li = q.getResultList();

		for(Employee fetched:li) {
			System.out.println("Employee id :"+fetched.getEmpid());
			System.out.println("\t Employee name :"+fetched.getEmpname());
			System.out.println("\t Employee salary :"+fetched.getEmpsal());
			System.out.println("\t Employee address :"+fetched.getEmpadd());
		}

		// print employee names in capital cases

		Query q1=   entity.createQuery("SELECT UPPER(e.empname) FROM Employee e");
		List<String> li1=  q1.getResultList();

		for(String upper:li1) {
			System.out.println("Employee name:"+upper);
		}


		// Maximun salary print

		Query q2= entity.createQuery("SELECT MAX(e.empsal) FROM Employee e");
		int maxSal=(int) q2.getSingleResult();
		System.out.println("Maximum salary :"+maxSal);


		// print salary between 2000 and 8000

		Query q3= entity.createQuery("SELECT e FROM Employee e where e.empsal BETWEEN 2000 AND 8000");
		List<Employee> li3=  q3.getResultList();

		for(Employee between:li3 ) {
			System.out.println("Employee id:"+between.getEmpid());
			System.out.println("\t salary between 2000 and 8000 :"+between.getEmpsal());
		}

		// print names starts with b

		Query q4=   entity.createQuery("SELECT e FROM Employee e where e.empname LIKE 'b%' ");
		List<Employee>li4= q4.getResultList();
		
		for(Employee starts:li4) {
			System.out.println("Employee id :"+starts.getEmpid());
			System.out.println("\t Employee name :"+starts.getEmpname());
		}
		
		// print salary >4000 and add 5000 to them
		
		   Query q5=   entity.createQuery("UPDATE Employee set empsal=empsal+5000 where empsal>4000");
//		  int updatedRec = q5.executeUpdate();
//		  
//		  System.out.println(updatedRec);
		  
		         // delete those having 6000 salary
		   
		    Query q6=  entity.createQuery("DELETE FROM Employee where empsal>6000");
//		        int deleteRec=  q6.executeUpdate();
//		        System.out.println("deleted recoreds :"+deleteRec);
		       
		        
	    
		    











		entity.getTransaction().commit();
	}

}
