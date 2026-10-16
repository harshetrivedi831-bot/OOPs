package com.inheritance.BankingOperation;

public class Driver {
public static void main(String[] args) {
	SavingAccount savingAccount= new SavingAccount("24234354546", 23400, "harsh", 6, 3000);
	System.out.println("-----saving account functionality created--");
	savingAccount.viewSavingAccountDetails();
}
}
