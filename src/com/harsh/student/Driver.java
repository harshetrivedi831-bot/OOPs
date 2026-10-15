package com.harsh.student;

public class Driver {
public static void main(String[] args) {
	Student student = new Student("Harsh",35);
	// An object with marks and name 
	/*
	 * change the marks directly from other class -- x
	 */
	/*
	 * setters and getters 
	 */
	student.setMarks(45);
	System.out.println(student.getMarks());
	// set 150 
	student.setMarks(145);
	
}
}
