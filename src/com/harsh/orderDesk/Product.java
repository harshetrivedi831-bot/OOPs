package com.harsh.orderDesk;

public class Product {
/*
 * parent --- Product class 
 * attributes --- 4 attributes common for all child
 * constructor : one full one and one more constructor where stock is default value
 * methods -- reduceStock(),• getFinalPrice() ....
 */
	private String productId;
	private String name;
	private double price;
	private int  stock;
	// getters and setters i need have getter only 
	
	
	public Product(String productId, String name, double price, int stock) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	// one that takes only id name and price
	public Product(String productId, String name, double price) {
		this(productId,name,price,0);
	}
	/*
	 * • reduceStock(int qty) returns true if the sale succeeds and false otherwise.
	 */
	/*
	 * int stock : available stock hai 
	 * then user need 3 quantity so available stock should
	 * be 7 how stock - quantity
	 */
	boolean reduceStock(int quantity) {
		if(stock<0) {// basic check
			System.out.println("invalid input");
		}
		if(quantity<=stock) {
			System.out.println("sale confirmed");
			stock = stock-quantity;
			return true;
		}
		return false;
	}
	double getFinalPrice() {
		if(price>0) {
			return price;
		}
		return 0;
		
	}
	void displayProductDetails() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.productId);
		System.out.println(this.stock);
	}
	
	
	
}
