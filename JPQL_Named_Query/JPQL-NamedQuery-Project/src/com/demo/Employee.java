package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="namedQuery")

@NamedQueries({
	@NamedQuery (name="Employee.getAllEmployees", query="SELECT e FROM Employee e"),
	@NamedQuery (name="Employee.getEmployeeUpperCase" ,query="SELECT UPPER(e.empname) FROM Employee e"),
	@NamedQuery (name="Employee.getEmployeeWithNameLike" ,query="SELECT e FROM Employee e where e.empname LIKE :pattern"),
	@NamedQuery (name="Employee.getEmployeeMaxSalary" , query="SELECT Max(e.empsal) FROM Employee e"),
	@NamedQuery (name="Employee.getEmployeeSalaryBetween" , query="SELECT e FROM Employee e where e.empsal BETWEEN :Low AND :High"),
	@NamedQuery (name="Employee.getEmployeeSalaryAndAdd", query="UPDATE Employee set empsal=empsal+:increment where empsal<:threshold"),
	@NamedQuery (name="Employee.getEmployeeAscendingOrder", query="SELECT e FROM Employee e ORDER By e.empname ASC")
	
})
public class Employee {

	
	@Id
	private int empid;
	private String empname;
	private int empsal;
	private String empadd;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	
	public Employee() {
		super();
		
	}
	
	public Employee(int empid, String empname, int empsal, String empadd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empadd=" + empadd + "]";
	}
	
	
}
