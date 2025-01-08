package com.core_java_project_Bank_Application;

import java.sql.Date;

public class Transaction{
	
	private String transactionId;
	private String sourceAccountNumber;
	private String destinationAccountNumber;
	private double amount;
	private String transactionType;
	private Date transactionDate;
	private double balanceAfterTransaction;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getSourceAccountNumber() {
		return sourceAccountNumber;
	}
	public void setSourceAccountNumber(String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}
	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}
	public void setDestinationAccountNumber(String destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getBalanceAfterTransaction() {
		return balanceAfterTransaction;
	}
	public void setBalanceAfterTransaction(double balanceAfterTransaction) {
		this.balanceAfterTransaction = balanceAfterTransaction;
	}
	
	
	public Transaction(String transactionId, String sourceAccountNumber, String destinationAccountNumber, double amount,
			String transactionType, double balanceAfterTransaction) {
		super();
		this.transactionId = transactionId;
		this.sourceAccountNumber = sourceAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
		this.amount = amount;
		this.transactionType = transactionType;
		this.transactionDate = new Date(0);  // current date and time
		this.balanceAfterTransaction = balanceAfterTransaction;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", sourceAccountNumber=" + sourceAccountNumber
				+ ", destinationAccountNumber=" + destinationAccountNumber + ", amount=" + amount + ", transactionType="
				+ transactionType + ", transactionDate=" + transactionDate + ", balanceAfterTransaction="
				+ balanceAfterTransaction + "]";
	}
	
	
	
	
	
}