package com.employee_mgment_system;

public class EmployeeAlreadyExistException extends EmployeeException{

	public EmployeeAlreadyExistException(String message) {
		super(message);
	}

}
