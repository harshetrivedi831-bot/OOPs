package com.inheritance.vehicleCompany;
// this object have common attributes + method
// which can be re used in child 
// code duplicay + re usability
public class Vehicle {
String model;
String brand;
String vehicleNumber;

public Vehicle(String model, String brand, String vehicleNumber) {
	super();
	this.model = model;
	this.brand = brand;
	this.vehicleNumber = vehicleNumber;
}
void start() {
	// logic to start 
	System.out.println("Vehicle.start()");
}
void stop() {
	// logic to stop
	System.out.println("Vehicle.stop()");
}
void displayVehicleDetails() {
	System.out.println("Brand : " + this.brand);
	System.out.println("Model : " + this.model);
	System.out.println("Vehicle Number  : " + this.vehicleNumber);
}
}
