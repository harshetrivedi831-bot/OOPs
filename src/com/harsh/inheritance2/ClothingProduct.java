package com.harsh.inheritance2;

public class ClothingProduct extends Product{
	String color;
	String fabric;
	// in child object parent part there so super in cosntructor
	public ClothingProduct(String productName, int productQuantity, String desciption, String status, String color,
			String fabric) {
		super(productName, productQuantity, desciption, status);
		this.color = color;
		this.fabric = fabric;
	}
	void viewClothingProduct(){
		// first generic
		this.viewProductDetails();
		// specific to clothing
		System.out.println(this.color);
		System.out.println(this.fabric);
	}

}
