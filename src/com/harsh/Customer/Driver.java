package com.harsh.Customer;

public class Driver {
public static void main(String[] args) {
	Customer harsh = new Customer("harsh");
	Customer sahil = new Customer("sahil");
	Customer[] customer = {harsh,sahil};
	for (int index = 0; index < customer.length; index++) {
		customer[index].earnCoupon();
		customer[index].earnCoupon();
		customer[index].earnCoupon();
		System.out.println();
		System.out.println( customer[index].getName() + " " + customer[index].getcouponCount());
		customer[index].redeemCoupon();
		customer[index].redeemCoupon();
		customer[index].redeemCoupon();
		customer[index].redeemCoupon();
	}
	
	
	
}
}
