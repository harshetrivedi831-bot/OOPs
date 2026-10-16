package com.inheritance.BankingOperation;

public class Account {
String accountNumber;
double salary;
String name;
public Account(String accountNumber, double salary, String name) {
	super();
	this.accountNumber = accountNumber;
	this.salary = salary;
	this.name = name;
}
void withdraw() {
	System.out.println("withdraw logic !!");
}
void deposit() {
	System.out.println("deposit logic");
}
void viewAccountDetails() {
	System.out.println(this.accountNumber);
	System.out.println(this.name);
	System.out.println(this.salary);
}
}
