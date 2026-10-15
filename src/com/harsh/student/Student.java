package com.harsh.student;

public class Student {
	private String name;
	private int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	// setter method to set marks field 
	// marks should be validated before making chnages to field
	public void setMarks(int marks) {
		if(marks>0 && marks<100) {
			this.marks=marks;
		}
		else
		{
			System.out.println("Invalid Marks");
		}
		
	}
	

}
