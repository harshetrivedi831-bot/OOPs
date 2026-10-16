package com.harsh.inheritance;
// develop bank account opening functionality 
// cause already exist in system so re use using inheritance 
//make sure is a relation is there
public class SavingAccount extends Account{
public void accountOpening(String name,String address,String type) {
	this.openAccount(name, address, type);
}
}
