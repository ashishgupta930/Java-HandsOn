package com.ashish.overriding.vegetable;

public class Potato extends Vegetable {

	public Potato() {
		super("Brown", "Sour");
	}
	void prepareChips() {
		System.out.println("Chips");
	}

}
