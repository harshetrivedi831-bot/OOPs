package com.inheritance.restaurant;

public class Driver {
public static void main(String[] args) {
	System.out.println("--------veg-------");
	VegRestaurant vegRestaurant= new VegRestaurant("12A", "BabaDhaba", "unnao", "yes", 10.00f, "yes");
	vegRestaurant.viewVegRestaurantDetails();
	System.out.println();
	VegRestaurant vegRestaurant1= new VegRestaurant("12B", "Theka", "unnao", "yes", 10.00f, "yes");
	vegRestaurant1.viewVegRestaurantDetails();
	System.out.println("-------non veg---------");
	NonVegRestaurant nonVegRestaurant=new NonVegRestaurant("123C", "kababStore", "kanpur", "yes", "yes");
	
	nonVegRestaurant.viewNonVegRestaurantDetails();
	
}
}
