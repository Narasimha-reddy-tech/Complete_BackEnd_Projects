package com.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
	public static void main(String[] args) {
		
 EntityManagerFactory factory=	Persistence.createEntityManagerFactory("narasimha");
 
          EntityManager entity=   factory.createEntityManager();
          
          entity.getTransaction().begin();
          
          // dml operations done here
          
          // inserting data into database table
          Employee emp=new Employee(10, "salaar", 200, "kansaar");
          
//          entity.persist(emp);
          
              // for updation    
          
     Employee fetchEmp=  entity.find(Employee.class, 10);
     
     System.out.println("employee id :"+fetchEmp.getEmpid());
     System.out.println("employee name :"+fetchEmp.getEmpname());
     System.out.println("employee salary :"+fetchEmp.getEmpsal());
     System.out.println("employee address :"+fetchEmp.getEmpadd());
          
          // update
     
         
         fetchEmp.setEmpname("pushpa");
         fetchEmp.setEmpsal(500);
         fetchEmp.setEmpadd("international");   
         
//         entity.merge(fetchEmp);
         
         // entity.remove(fetchEmp);
        
          entity.getTransaction().commit();
	}

}
