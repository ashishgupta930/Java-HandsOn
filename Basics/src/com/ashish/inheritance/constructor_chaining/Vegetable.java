package com.ashish.inheritance.constructor_chaining;

public class Vegetable {

	String type;
	int price;
	public Vegetable(String type, int price) {
		this.type = type;
		this.price = price;
	}
	Vegetable(int price){
		this("bitter",300);
	}
}
