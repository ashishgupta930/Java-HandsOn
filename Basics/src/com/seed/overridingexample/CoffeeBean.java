package com.seed.overridingexample;

public class CoffeeBean extends Seed{

	void prepareCoffee() {
		System.out.println("Prepare Coffee");
	}
	@Override
	void grow() {
System.out.println("Prepare Coffee");
	}
}
