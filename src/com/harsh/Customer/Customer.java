package com.harsh.Customer;

public class Customer {
private String name;
private int couponCount;
int getcouponCount() {
	return couponCount;
}
public Customer(String name) {
	super();
	this.name = name;
	this.couponCount=0;//set for every object creation
	// separately no need to pass count of coupon code
}
String getName() {
	return name;
}
// place order -- earn coupon
int earnCoupon() {
return couponCount++;
}
void redeemCoupon() {
	if(couponCount>=1) {
		couponCount--;
		System.out.println("coupon redemmed");
	}
	else
	{
		System.out.println("no coupon available");
	}
	
}
void displayStatus() {
	System.out.println(this.couponCount);
	System.out.println(this.name);
}

}
