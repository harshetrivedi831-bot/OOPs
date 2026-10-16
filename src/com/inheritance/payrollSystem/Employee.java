package com.inheritance.payrollSystem;

public class Employee {
	// attributes
String employeeID;
String name;
double basicSalary;
int leaveBalance;
public Employee(String employeeID, String name, double basicSalary, int leaveBalance) {
	super();
	this.employeeID = employeeID;
	this.name = name;
	this.basicSalary = basicSalary;
	this.leaveBalance = leaveBalance;
}
void viewEmployeeDetails() {
	System.out.println(employeeID);
	System.out.println(name);
	System.out.println(basicSalary);
	System.out.println(leaveBalance);
}
// in case need salary calculation for child
// re use this method.
double calculateSalary(double basicSalary) {
	double HRA = calculateHRA(basicSalary);
	double tax = calculateTax(basicSalary);
	double netSalary = basicSalary+HRA-tax;
	return netSalary;
}
// Behaviors
// for every employee calculateSalary is needed 
double calculateTax(double basicSalary) {
	// HRA calculation
//	double HRA = calculateHRA(basicSalary);
	if(basicSalary>50000)
	{
		double tax =  (basicSalary*10/100);
		basicSalary=basicSalary-tax;
		return basicSalary;
	}
	else
	{
		double tax =  (basicSalary*5/100);
		basicSalary=basicSalary-tax;
		return basicSalary;
	}
	
	
}
 
// calculate HRA on top of 
double calculateHRA(double basicSalary) {
	return basicSalary*20/100;
}
// request to apply for leave 
//input : days
void applyLeave(int days)
{
	// invalid input
	if(days<=0) {
		System.out.println("Invalid days");
		
	}
	// if let say employee says 
	if(days<=leaveBalance) {
		System.out.println("Leave approved");
	}
}

}
