package com.harsh.orderDesk;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	Electronics laptop = new Electronics("E1", "Laptop", 50000, 4, 12);
	// let see the warranty months of E1 product
	int warrantyMonths =laptop.getWarrantyMonths();
	System.out.println("warrantyMonths :" + warrantyMonths);
	// now i want to see finalPrice after gst
	double finalPrice = laptop.getFinalPrice();
	System.out.printf("finalPrice after gst: %.3f%n" , finalPrice);
	// let see all the details
	laptop.displayElectronicDetails();
	
	
}
}
