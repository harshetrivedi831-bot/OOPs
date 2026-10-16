package com.inheritance.BankingOperation;

public class SavingAccount extends Account{
	double interestRates;
	double limitWithdrawal;
	public SavingAccount(String accountNumber, double salary, String name, double interestRates,
			double limitWithdrawal) {
		super(accountNumber, salary, name);
		this.interestRates = interestRates;
		this.limitWithdrawal = limitWithdrawal;
	}
	// will have withdraw logic and deposit can do in savings + extra
	// offers you a interest rate
	// minimumMaintenance
	// interest rate field b/s method does processing on data
	void addInterest() {
		System.out.println("SavingAccount.addInterest()");
	}
	// method takes limitWithdraal
	void minimumMaintenance() {
		System.out.println("SavingAccount.withdrawalCapacity()");
	}
	void viewSavingAccountDetails() {
		viewAccountDetails();
		System.out.println(this.interestRates);
		System.out.println(this.limitWithdrawal);
	}
	

}
