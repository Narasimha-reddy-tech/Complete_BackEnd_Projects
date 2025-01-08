package com.core_java_project_Bank_Application;

import java.util.*;
import java.util.Scanner;

public class BankClient{

	private static HashMap<String,Account> accounts = new HashMap();
	private static HashMap<String,Transaction> transactions=new HashMap();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {

		while(true) {
			showMenu();
			int choice=sc.nextInt();
			sc.nextLine();

			switch(choice) {
			case 1 : createAccount();break;
			case 2 : showBalance() ; break;
			case 3 : deposit(); break;
			case 4 : withdraw();break;
			case 5 : fundTransfer();break;
			case 6 : printBankStatement();break;
			case 7 : System.out.println("Exiting...");break;
			default :
				System.out.println("invaild choice ! try again");
			}
		}
	}

	private static void showMenu() {

		System.out.println("\n Banking application menu");
		System.out.println("1. create account");
		System.out.println("2. show balance");
		System.out.println("3. deposit");
		System.out.println("4. withdraw");
		System.out.println("5. fund transfer");
		System.out.println("6. print bank statement");
		System.out.println("7.exit");
		System.out.println("choose an option :");
		
	}

	private static void createAccount() {
		
       System.out.println("Enter account holder name :");
       String name= sc.nextLine();
       
       System.out.println("Account type (eg., savings , checking ): ");
       String type =sc.nextLine();
       
       System.out.println("Enter address :");
       String address=sc.nextLine();
       
       System.out.println("Contact number (used as account number) :");         
       String contact =sc.nextLine();
       
       Account account=new Account(name, type, address, contact);
       accounts.put(account.getAccountNumber(), account);
       System.out.println("Account created successfully ! with account number :"+account.getAccountNumber());
		
	}

	private static void showBalance() {

		System.out.println("Enter your account number :");
		String accountNumber =sc.nextLine();
		
		Account account=accounts.get(accountNumber);
		
		if(account !=null) {
			System.out.println("Balance for the account :" +accountNumber + " " +account.getBalance());
		}
		else {
			System.out.println("Account not found");
		}
	}

	
	private static void deposit() {

		System.out.println("Enter your account number :");
		String accountNumber =sc.nextLine();
		
		Account account=accounts.get(accountNumber);
		
		System.out.println("Enter amount to deposit :");
		double amount=sc.nextDouble();
		if(account !=null) {
			account.deposit(amount);
		}
		else {
			System.out.println("Account not found");
		}
		
	}
	private static void withdraw() {


	}

	private static void fundTransfer() {


	}

	private static void printBankStatement() {


	}


}