package com.inheritance.restaurant;

public class VegRestaurant extends Restaurant {// restaurants who are veg food
// common + specific properties 
	// create objects of restaurant which offers veg food plus extra benefits
	String foodDelievery;
	float delieveryTime;
	String tableResevation;
	
	
	public VegRestaurant(String restaurantId, String name, String location, String foodDelievery, float delieveryTime,
			String tableResevation) {
		super(restaurantId, name, location);
		this.foodDelievery = foodDelievery;
		this.delieveryTime = delieveryTime;
		this.tableResevation = tableResevation;
	}


	void viewVegRestaurantDetails() {
		this.viewRestaurantDetails();
		System.out.println(this.foodDelievery);
		System.out.println(this.delieveryTime);
		System.out.println(this.tableResevation);
	}
}
