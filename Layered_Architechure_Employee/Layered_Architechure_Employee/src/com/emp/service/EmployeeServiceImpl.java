package com.emp.service;

import java.util.Map.Entry;
import java.util.Set;

import com.emp.dao.EmployeeDaoImpl;
import com.emp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDaoImpl dao=new EmployeeDaoImpl();   // dao layer object created to access data from dao
	
	@Override
	public int addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
	}

	@Override
	public Employee updateEmployee(int employeeId, Employee emp) {
		
		return dao.updateEmployee(employeeId, emp);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		
		return dao.getEmployee(employeeId);
	}

	@Override
	public String deleteEmployee(int employeeId) {
		
		return dao.deleteEmployee(employeeId);
	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployee() {
		
		return dao.getAllEmployee();
	}

	
	
}
