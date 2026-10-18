package com.harsh.Bank;

public class Driver {
public static void main(String[] args) {
	BankAccount account = new BankAccount("734636843374855", 10000);
	/*
	 * object with data accNum and 10k balance
	 */
	// this balance i want to read - use getter method 
	int balance=account.getBalance();
	System.out.println("current balance : " + balance);
	System.out.println();
	System.out.println();
	
	// deposit money that will be added in balance
	account.doDeposit(2000);
	
	
	// withdrae money 
	int withdrawalAmount = account.doWithdraw(33000);
	System.out.println("Balance after withdrawal : " + withdrawalAmount);
	System.out.println();
	account.setAccountNumber("839357846xxx");
	
	System.out.println();
	
	account.displayBalance();
}
}
