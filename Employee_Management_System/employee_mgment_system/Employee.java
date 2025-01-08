package com.employee_mgment_system;

public class Employee {

	
	private String employeeName;
	private double employeeSalary;
	private String employeeAddress;
	private String employeeEmailId;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(String employeeName, double employeeSalary, String employeeAddress, String employeeEmailId) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
		this.employeeEmailId = employeeEmailId;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", employeeAddress="
				+ employeeAddress + ", employeeEmailId=" + employeeEmailId + "]";
	}
	
	
	
	
}
