package com.inheritance.payrollSystem;
// manager is a type of employee 
// manager have name id leave salary calcula leave 
public class Manager extends Employee{
	// manage team : may decide bonus 
	int teamSize;
	double bonusPercent;
	public Manager(String employeeID, String name, double basicSalary, int leaveBalance, int teamSize,
			double bonusPercent) {
		super(employeeID, name, basicSalary, leaveBalance);
		this.teamSize = teamSize;
		this.bonusPercent = bonusPercent;
	}
	@Override
	double calculateSalary(double basicSalary) {
		//manager recieve team allowance 1k per member
		int teamAllowance = this.teamSize*1000;
		double bonusPercent = (basicSalary*10/100);
		basicSalary=basicSalary+teamAllowance+bonusPercent;
		
		return super.calculateSalary(basicSalary);
	}
	
	void viewManagerDetails() {
		viewEmployeeDetails();
		System.out.println(teamSize);
		System.out.println(bonusPercent);
	}

}
