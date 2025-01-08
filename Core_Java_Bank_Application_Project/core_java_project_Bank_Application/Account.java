package com.core_java_project_Bank_Application;

import javax.print.attribute.standard.Destination;

public class Account{
	
	private String accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;
	private String address;
	private String contactNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	// to deposit
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	//  to withdraw
	public boolean withdraw(double amount) {
		if(this.balance>=amount) {
			this.balance-=amount;
			return true;
		}
		return false;
	}
	
	// to transfer
	public boolean transfer(Account destination,double amount) {
		if(this.withdraw(amount)) {
			destination.deposit(amount);
			return true;
		}
		return false;
	}
	
	
	public Account(String accountHolderName, String accountType,String address,
			String contactNumber) {
		super();
		this.accountNumber = generateAccountNumber(contactNumber);
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = 0.0;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	
	private static String generateAccountNumber(String contactNumber) {
		return "ACC" + contactNumber.substring(contactNumber.length()-4);
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", balance=" + balance + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}
	
	
	
	
}