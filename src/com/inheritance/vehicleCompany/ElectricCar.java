package com.inheritance.vehicleCompany;

public class ElectricCar extends Vehicle{
	int bateryCapacity;
	public ElectricCar(String model, String brand, String vehicleNumber,int bateryCapacity) {
		super(model, brand, vehicleNumber);
		// TODO Auto-generated constructor stub
		this.bateryCapacity=bateryCapacity;
	}
	void viewElectricCarDetails() {
		displayVehicleDetails();
		System.out.println("Battery Capacity : " + this.bateryCapacity);
	}
	
	
	
	void chargingBaterry() {
	System.out.println("ElectricCar.chargingBaterry()");	
	}
	
	

}
