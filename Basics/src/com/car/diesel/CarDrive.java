package com.car.diesel;

public class CarDrive {

	public static void main(String[] args) {
		Car c = new Car();
		Diesel d = new Diesel();
		c.fill(d);
		ElectricCharge ec = new ElectricCharge();
		c.fill(ec);
	}
}
