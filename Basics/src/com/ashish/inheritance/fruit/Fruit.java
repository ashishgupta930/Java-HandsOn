package com.ashish.inheritance.fruit;

public class Fruit {
	String color;
	int price;

	void clean() {
		System.out.println("Slice and clean");
	}

	void prepareJuice() {
		this.clean();
		System.out.println("add to mixer and crush");
	}
}
