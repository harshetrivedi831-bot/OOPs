package com.harsh.inheritance2;

public class Driver {
public static void main(String[] args) {
	ClothingProduct clothingProduct=new ClothingProduct("Trouser", 2, "brethable hai", "Out-Of-Stock", "khakhee", "cotton");
	System.out.println("----common details-----");
	clothingProduct.viewProductDetails();
	System.out.println("--- common + specific details ------");
	clothingProduct.viewClothingProduct();
}
}
