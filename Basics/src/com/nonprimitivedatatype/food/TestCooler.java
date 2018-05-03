package com.nonprimitivedatatype.food;

public class TestCooler {

	public static void main(String[] args) {
		System.out.println("Cooler is Present");
		Cooler c = new Cooler();
		System.out.println("Filling the cooler with water");
		Air a = c.cool(new ColdWater());
		System.out.println("Recieved Air");
	}
}
