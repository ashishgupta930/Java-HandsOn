package com.ashish.overriding.vegetable;

public class Vegetable {

	String color;
	String type;
	void clean() {
		System.out.println("Cut,scrape and clean with water");
	}
	
	public Vegetable(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
}
