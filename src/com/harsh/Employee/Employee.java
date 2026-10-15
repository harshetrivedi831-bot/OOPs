package com.harsh.Employee;

public class Employee {
	private String name;
	private double salary;
	// increment salary based on percentage
	// representing behviour of real life Employee 
	double incrementSalary(double percentage) {
		salary = salary + (salary*percentage/100);
		return salary;
	}
	Employee(String _name, double _salary) {
		name = _name;
		salary = _salary;
	}

	String getName() {
		return name;
	}

	double getSalary() {
		return salary;
	}

	void setName(String _name) {
		name = _name;
	}

	void setSalary(double _salary) {
		salary = _salary;
	}
}
