package com.emp.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.emp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	// Database
	HashMap<Integer,Employee> employee=new HashMap<Integer,Employee>();
	int employeeId=100;

	@Override
	public int addEmployee(Employee emp) {
		employee.put(employeeId++, emp);
		
		return employeeId;
	}

	@Override
	public Employee updateEmployee(int employeeId, Employee emp) {
		   Employee empUpdate= employee.put(employeeId, emp);
		
		return empUpdate;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		Employee empGet=employee.get(employeeId);
		return empGet;
	}

	@Override
	public String deleteEmployee(int employeeId) {
	        employee.remove(employeeId);
		return "Employee deleted successfully ! :"+employeeId;
	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployee() {
		 Set<Entry<Integer, Employee>> result=employee.entrySet();
		return result;
	}

	
	
	
}
