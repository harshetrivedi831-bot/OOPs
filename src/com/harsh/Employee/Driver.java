package com.harsh.Employee;

public class Driver {
public static void main(String[] args) {
	Employee employee = new Employee("Harsh", 50000);
	double incrementedSalary = employee.incrementSalary(10);
	System.out.println(incrementedSalary);
	System.out.println(employee.getSalary());
}
}
