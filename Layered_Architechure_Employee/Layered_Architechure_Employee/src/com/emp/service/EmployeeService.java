package com.emp.service;


import java.util.Map.Entry;
import java.util.Set;

import com.emp.model.Employee;

public interface EmployeeService {

	   int addEmployee(Employee emp);
	 Employee  updateEmployee(int employeeId,Employee emp);
	Employee getEmployee(int employeeId);
	String deleteEmployee(int employeeId);
	Set<Entry<Integer,Employee>> getAllEmployee();
	
	
}
