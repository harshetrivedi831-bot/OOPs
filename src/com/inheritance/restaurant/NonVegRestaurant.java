package com.inheritance.restaurant;

public class NonVegRestaurant extends Restaurant {
String hygiene;
String waterCooler;
public NonVegRestaurant(String restaurantId, String name, String location, String hygiene, String waterCooler) {
	super(restaurantId, name, location);
	this.hygiene = hygiene;
	this.waterCooler = waterCooler;
}
void viewNonVegRestaurantDetails() {
	this.viewRestaurantDetails();
	System.out.println(this.hygiene);
	System.out.println(this.waterCooler);
}

}
