package com.emp.controller;

import java.util.Iterator;  
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



import com.emp.model.Employee;
import com.emp.service.EmployeeService;
import com.emp.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service=new EmployeeServiceImpl();
		
		while(true) {
		System.out.println(" ** Employment Management System **");
		System.out.println("1.Add employee details");
		System.out.println("2.update employee details");
		System.out.println("3.get employee details");
		System.out.println("4.delete employee details");
		System.out.println("5.Get all employee details");
		
		Scanner sc=new Scanner(System.in);
		
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Enter employee name");
			String employeeName=sc.next();
			System.out.println("Enter employee salary");
			int employeeSalary=sc.nextInt();
			System.out.println("Enter employee address");
			String employeeAddress=sc.next();
			System.out.println("Enter employee mail");
			String employeeMail=sc.next();
			
		      Employee emp=new Employee(employeeName, employeeSalary, employeeAddress, employeeMail);
		      int employeeId=service.addEmployee(emp);
		      System.out.println("employee added successfully !"+employeeId);
			break;
		case 2:
			System.out.println("enter employee id to update details");
	        int empId=sc.nextInt();
	        
	        System.out.println("Enter employee name");
			String employeename=sc.next();
			System.out.println("Enter employee salary");
			int employeesalary=sc.nextInt();
			System.out.println("Enter employee address");
			String employeeaddress=sc.next();
			System.out.println("Enter employee mail");
			String employeemail=sc.next();
			
			Employee emp1=new Employee(employeename, employeesalary, employeeaddress, employeemail);
			
			Employee empobj=service.updateEmployee(empId, emp1);
			System.out.println("employee updated successfully :"+empId);
			break;
		case 3:
			System.out.println("enter employee id");
			int emp2=sc.nextInt();
			
		Employee empo=	service.getEmployee(emp2);
		System.out.println(empo);
			
			break;
		case 4:
			System.out.println("enter employee id");
			int emp3=sc.nextInt();
			
			String del=service.deleteEmployee(emp3);
			System.out.println(del);
			
			
			break;
		case 5:
		Set<Entry<Integer,Employee>>result=	service.getAllEmployee();
		Iterator<Entry<Integer,Employee>> itr=result.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,Employee> finalResult=itr.next();
			System.out.println(finalResult.getKey() + " "+finalResult.getValue());
		}
		
			break;
		default:
			System.out.println("enter a valid option");
			break;
		
		}
		
		}
	}
	
	
}
