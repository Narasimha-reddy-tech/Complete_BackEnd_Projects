package com.demo.controller;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {

	
	public static void main(String[] args) {
		
		EmployeeService service=new EmployeeServiceImpl();   // object of serviceiml layer created
		
	      Employee emp=new Employee("bhima", 2000, "kukatpally"); // parum const of employee for storing details
	      
//	      service.addEmployee(emp);
	      
	   Employee fetchemp=  service.findEmployeeById(1); // we dont know which id .so,kept as 1
	      
	     System.out.println("Employee id:"+fetchemp.getEmpid());
	     System.out.println("Employee name:"+fetchemp.getEmpname());
	     System.out.println("Employee salary:"+fetchemp.getEmpsal());
	     System.out.println("Employee address:"+fetchemp.getEmpadd());
	     
	   
	     fetchemp.setEmpname("ballala");
	     fetchemp.setEmpsal(5000);
	     fetchemp.setEmpadd("hyd");
	     
	     service.updateEmployee(fetchemp);
	     
//	     service.deleteEmployee(emp);
	}
}
