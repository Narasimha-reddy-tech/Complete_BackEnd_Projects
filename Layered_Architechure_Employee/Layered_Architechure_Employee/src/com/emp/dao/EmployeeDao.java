package com.emp.dao;

import java.util.Set;
import java.util.Map.Entry;

import com.emp.model.Employee;

public interface EmployeeDao {

	
	 int   addEmployee(Employee emp);
	 Employee  updateEmployee(int employeeId,Employee emp);
	Employee getEmployee(int employeeId);
	String deleteEmployee(int employeeId);
	Set<Entry<Integer,Employee>> getAllEmployee();
}
