package com.harsh.lbms;

public class Driver {
public static void main(String[] args) {
	/*
	 * for multiple method : I would go for array, 
	 * for same method call
	 */
	Member member = new Member("Harsh");
	member.issueBook();
	member.issueBook();
	member.issueBook();
	member.issueBook();
	member.display();
	member.returnBook();
	member.returnBook();
	member.returnBook();
	member.returnBook();
	member.display();
}
}
