package com.ashish.overriding.vegetable;

public class Capsicum extends Vegetable {

	public Capsicum() {
		super("Green", "Spicy");
	}
	void preparePizza() {
		System.out.println("Pizza");
	}
	@Override
	void clean() {
System.out.println("Clean Potato");
	}

}
