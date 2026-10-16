package com.inheritance.restaurant;
// common attributes and method can be re used in child considering is a relationship
public class Restaurant {
String restaurantId;
String name;
String location;

public Restaurant(String restaurantId, String name, String location) {
	super();
	this.restaurantId = restaurantId;
	this.name = name;
	this.location = location;
}

void viewRestaurantDetails() {
	System.out.println(this.restaurantId);
	System.out.println(this.name);
	System.out.println(this.location);
}
}
