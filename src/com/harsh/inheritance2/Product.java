package com.harsh.inheritance2;

public class Product {
String productName;
int productQuantity;
String desciption;
String status;
public Product(String productName, int productQuantity, String desciption, String status) {
	super();
	this.productName = productName;
	this.productQuantity = productQuantity;
	this.desciption = desciption;
	this.status = status;
}
// to display common details
void viewProductDetails() {
	System.out.println(productName);
	System.out.println(productQuantity);
	System.out.println(desciption);
	System.out.println(status);
}
}
