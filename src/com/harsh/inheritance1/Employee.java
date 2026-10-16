package com.harsh.inheritance1;

 class Employee {
String name ="harsh";
String address = "kabristan road";
private String empCode = "32847Abc";
public void markIn(String empId) {
	System.out.println("mark in : " + empId);
}
}
 // manager is a type of Employee
class Manager extends Employee
{
	
	public void doSomething() {
		// below fields and behvaiours are inherited from parent
		System.out.println(this.name);
		System.out.println(this.address);
		markIn("121A");
	}
}
class Driver
{
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.doSomething();
	}
}