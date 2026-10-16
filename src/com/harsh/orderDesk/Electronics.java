package com.harsh.orderDesk;

public class Electronics extends Product{
	private int warrantyMonths;
	/*
	 * a field and a method i need to add 
	 * casue gst to be applied on finalPrice 
	 * so override the finalPrice
	 */

	public int getWarrantyMonths() {
		return warrantyMonths;
	}


	public Electronics(String productId, String name, double price, int stock, int warrantyMonths) {
		super(productId, name, price, stock);
		this.warrantyMonths = warrantyMonths;
	}
	/*
	 * super is bringing parent method behviour in child
	 * where i overridden 
	 */
	@Override
	double getFinalPrice() {
		double finalPrice = super.getFinalPrice();
		double gst = finalPrice*0.18f;
		finalPrice= finalPrice+gst;
		return finalPrice;
	}
	void displayElectronicDetails(){
		displayProductDetails();
		System.out.println(this.warrantyMonths);
	}
	
	
	

}
