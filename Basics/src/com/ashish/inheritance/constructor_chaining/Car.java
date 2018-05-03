package com.ashish.inheritance.constructor_chaining;

public class Car extends Vehicle {

	boolean isACPresent;
	void tempControl() {
		System.out.println("Temp");
	}
	 Car() {
		
		//super("Black", 1000);
		this("Black",5000,true);
		System.out.println("Car zero param constuctor");
		
	}
	 public Car(String color, int price, boolean isACPresent) {
		 super(color,price);
		 this.isACPresent=isACPresent;
	}
	public static void main(String[] args) {
		Car c = new Car();
	}
	
		
	}
	


