package com.ashish.inheritance.casting;

public class Animal {

	String color;
	String type;

	public Animal(String color, String type) {
		this.color = color;
		this.type = type;
	}

	void eat() {
		System.out.println("Animal Eat");
	}

	void sleep() {
		System.out.println("Animal Sleep");
	}
	

}
