package com.emp.model;

public class Employee {

	private String employeeName;
	private int employeeSalary;
	private String employeeAddress;
	private String employeeMail;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeMail() {
		return employeeMail;
	}
	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}
	
	
	public Employee() {
		super();
		
	}
	
	
	public Employee(String employeeName, int employeeSalary, String employeeAddress, String employeeMail) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
		this.employeeMail = employeeMail;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", employeeAddress="
				+ employeeAddress + ", employeeMail=" + employeeMail + "]";
	}
	
	
	
}
