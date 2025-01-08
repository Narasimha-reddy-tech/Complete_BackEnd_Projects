package com.demo.service;

import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDaoImpl dao; // daoImpl obj created here to get details from there to here;
	
	public EmployeeServiceImpl() {
	
		dao=new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
		
	}

	@Override
	public Employee findEmployeeById(int empid) {
		Employee emp=dao.getEmployeeById(empid);
		return emp;
	}
	
	
	   

	

}
