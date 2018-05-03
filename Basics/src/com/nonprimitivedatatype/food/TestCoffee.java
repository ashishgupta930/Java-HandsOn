package com.nonprimitivedatatype.food;

public class TestCoffee {

	public static void main(String[] args) {
		CoffeeMachine c = new CoffeeMachine();
		Water w = new Water();
		CoffeeBean cb = new CoffeeBean();
		Coffee espresso = c.prepareCoffee(w,cb);
	}
}
