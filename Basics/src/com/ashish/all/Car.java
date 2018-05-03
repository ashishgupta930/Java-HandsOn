package com.ashish.all;

public class Car {

	String color; // instance variables
	String brand = "Honda";
	int price;
	int gear = 0;

	void moveForward() {
		System.out.println("move forward");
	}

	void disp() {
		System.out.println(color + " " + this.price + " " + this.brand);// (this) is the object reference c1 and c2
	}

	void shiftGearUp() {
		if (gear < 5) {
			gear += 1;

		}
		System.out.println("Car is running on gear " + gear);
	}

	void shiftGearDown() {
		if (gear > 0) {
			gear -= 1;

		}
		System.out.println("Car is Running " + gear);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.disp();
		c1.color = "Red";
		c1.price = 1500000;
		c1.moveForward();
		c1.disp();

		Car c2 = new Car();
		c2.disp();
		c2.shiftGearUp();
		c2.shiftGearUp();
		c2.shiftGearUp();
		c2.shiftGearDown();
		c2.shiftGearDown();
		c2.shiftGearDown();
	}
}
