package com.ashish.inheritance.casting;

public class Cow extends Animal {

	public Cow(String color, String type) {
		super(color, type);
	}
	
	void giveMilk() {
		System.out.println("Milk giving");
	}
}
