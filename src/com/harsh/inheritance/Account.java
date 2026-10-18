package com.harsh.inheritance;

public class Account {
	static int count;
	String name;
	
	
public Account(String name) {
		super();
		this.name = name;
	}
public void openAccount(String name,String address,String type) {
	System.out.println("open bank account business logic is here");
	System.out.println("assume 500 lines are there");
	System.out.println("name " + name + "address : " +address + "type :" + type);
	
}
{
	count++;
}
static
{
	System.out.println("Account.enclosing_method()");
}
}
