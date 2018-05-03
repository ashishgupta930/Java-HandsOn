package com.ashish.overridingexample;

public class TestVehicle {
public static void main(String[] args) {
	Bike b  = new Bike();
	b.start();
	
	Truck t = new Truck();
	t.start();
	
	Car c = new Car();
	c.start();
	
	SportsCar sc = new SportsCar();
	sc.start();
	}
}
	

