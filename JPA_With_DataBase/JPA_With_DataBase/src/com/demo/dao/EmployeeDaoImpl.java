package com.demo.dao;

import javax.persistence.EntityManager;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	
	private EntityManager entity;          // creation of entityManager obj , for getting entity here;
	
	public EmployeeDaoImpl() {
		
		entity=JpaUtil.getEntityManager();
		}

	@Override
	public Employee getEmployeeById(int empid) {
		Employee emp=entity.find(Employee.class, empid);
		return emp;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		entity.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
	entity.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
		entity.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entity.getTransaction().commit();
		
	}

	
	

}
