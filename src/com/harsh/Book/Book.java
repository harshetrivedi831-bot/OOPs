package com.harsh.Book;

public class Book {
private String title;
private double price;
void displayBook() {
	System.out.println("Title : " + this.title);
	System.out.println("Price : " + this.price);
}
public Book(String title, double price) {
	super();
	this.title = title;
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
