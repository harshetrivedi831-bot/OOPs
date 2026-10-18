package com.harsh.Bank;

public class BankAccount {
	// data
	private String accountNumber;
	private int balance;
	BankAccount(String accountNumber,int balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	// setter methods to set the value in a private fields
	void setAccountNumber(String _accountNumber) {
		this.accountNumber = _accountNumber;
		
	}

	// getter to read varible outside the class casue it is public
	public String getAccountNumber() {
		return accountNumber;
	}

	// method to deposit amount, user will input amount that is to be deducted from
	// balance
	int doDeposit(int depositAmount) {
		// should not be -ve nikalna hai from exiting balance
		if (depositAmount > 0) {
			System.out.print("Deposit amount is  " + depositAmount);
			balance = balance + depositAmount;
			System.out.println(" :new balance : is " + balance);
			System.out.println();
		}
		else {
			System.out.println("invalid amount");
		}
		return balance;
		
		
	}

	int doWithdraw(int withdrawalAmount) {
		if(withdrawalAmount>0) {
			if(withdrawalAmount>balance) {
				System.out.println("Withdrawal invalid amount");
			}
			else {
				balance = balance - withdrawalAmount;
			}
		}
		
		// should not be -ve nikalna hai from exiting balance
		
		return balance;

	}

	public int getBalance() {
		return balance;
	}
	void displayBalance() {
		System.out.println("Balance : " + balance);
		System.out.println();
	}
}
