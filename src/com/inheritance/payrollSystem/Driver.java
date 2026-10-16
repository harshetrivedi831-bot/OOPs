package com.inheritance.payrollSystem;

public class Driver {
public static void main(String[] args) {
	// generic details
	Employee employee=new Employee("Abc12", "Harsh", 40000, 12);
	double employeeSalary = employee.calculateSalary(employee.basicSalary);
	System.out.println(employeeSalary);
	employee.viewEmployeeDetails();
}
}
