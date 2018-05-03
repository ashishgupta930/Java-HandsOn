package com.ashish.inheritance.constructor_chaining;

public class Boy extends Student {

	public Boy(String name, int age, String gender) {
		super(name, age, gender);
	}

	Boy() {
		this("ashish", 4344, "Male");
		// super("ashish",3434,"Male");
	}
	
	public static void main(String[] args) {
		Boy b = new Boy();
	}
}
