package com.employee_mgment_system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		HashMap <Integer,Employee> employee=new HashMap();
		int employeeId=101;

		Scanner sc=new Scanner(System.in);
		try {
			while(true) {
				System.out.println("** Employee Management System **");
				System.out.println("1.Add employee Details ");
				System.out.println("2.Update employee Details");
				System.out.println("3.Get employee Details");
				System.out.println("4.Delete employee Details");
				System.out.println("5.Get all employee Details");


				int option=sc.nextInt();

				switch(option) {
				case 1 :
					System.out.println("Adding employee Details :");

					System.out.println("Enter employee name");
					String employeeName=sc.next();
					System.out.println("Enter employee salary");
					double employeeSalary=sc.nextDouble();
					System.out.println("Enter employee address");
					String employeeAddress=sc.next();
					System.out.println("Enter employee email");
					String employeeMailId=sc.next();

					if(employeeName.isEmpty() || employeeSalary<=0 || employeeAddress.isEmpty() || employeeMailId.isEmpty()) {
						throw new InvalidInputException("enter the correct input");
					}

					if(employee.containsKey(employeeId)) {
						throw new EmployeeAlreadyExistException("employee is already existing");
					}

					Employee emp=new Employee(employeeName, employeeSalary, employeeAddress, employeeName);
					employee.put(employeeId++, emp);
					System.out.println("Employee added successfully ! with employee Id :"+employeeId);


					break;
				case 2 :
					System.out.println("Updating employee Details");

					System.out.println("Enter the employeeId to update");
					int employeeId2=sc.nextInt();
					
//					if(!employee.containsKey(employeeId)) {
//						throw new EmployeeNotFoundException("Employee is not found with "+employeeId);
//					}

					System.out.println("Enter employee name");
					String employeename=sc.next();
					System.out.println("Enter employee salary");
					double employeesalary=sc.nextDouble();
					System.out.println("Enter employee address");
					String employeeaddress=sc.next();
					System.out.println("Enter employee email");
					String employeemailId=sc.next();

					Employee updateEmployee=new Employee(employeename, employeesalary, employeeaddress, employeename);

					employee.put(employeeId2, updateEmployee);
					
					System.out.println("Employee details updated successfully ! with Id :"+employeeId);

					break;
				case 3 :
					System.out.println("Getting employee Details");
					
					System.out.println("Enter employee Id");
                    int empId1= sc.nextInt();
                    
                   Employee empobj= employee.get(empId1);
                   System.out.println(empobj);
					
					break;
				case 4 :
					System.out.println("Deleting employee Details");
					
					System.out.println("Enter employee Id");
					int empId2=sc.nextInt();
					employee.remove(empId2);
					System.out.println("Employee deleted successfully ! with employee id :"+empId2);

					break;
				case 5 :
					System.out.println("Getting all employee Details");
					
					
					// using entryset to iterate as it is HashMap 
					
					Set<Entry<Integer,Employee>> result=employee.entrySet();
					if(result.isEmpty()) {
						throw new EmployeeNotFoundException("Employees not found ");
					}
					Iterator<Entry<Integer,Employee>> itr=result.iterator();
					
					while(itr.hasNext()) {
						Entry<Integer,Employee> finalResult=itr.next();
						System.out.println(finalResult.getKey() + " "+ finalResult.getValue());
					}
					

					break;
				default :
					System.out.println("Enter a valid option !");
					break;
				}
			}
		}
		catch(Exception e) {
			System.err.println("Error :"+e.getMessage());
		}
	}
}
