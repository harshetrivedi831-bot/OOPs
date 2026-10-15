package com.harsh.lbms;

public class Member {
private String name;
private int issuedBook;//0 for every Customer object
// method : to issue one book per method call + max
void issueBook(){
	if(issuedBook<3) {
		issuedBook++;//maximum 3 for each customer
		System.out.println("Book issued : " + issuedBook);
	}
	else
	{
		System.out.println("maximum 3 books allowed");
	}
	
}
// return book if at-least one book is there
void returnBook() {
	if(issuedBook>=1) {
		issuedBook--;
		System.out.println("book returned");
	}
	else
	{
		System.out.println("No book to be returned");
	}
}
void display() {
	System.out.println("Book : " + this.issuedBook + ", Name : " + this.name);
}
public Member(String name) {
	super();
	this.name = name;
	this.issuedBook=0;
}
public String getName() {
	return name;
}

public int getIssuedBook() {
	return issuedBook;
}




}
