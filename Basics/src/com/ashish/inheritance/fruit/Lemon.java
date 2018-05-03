package com.ashish.inheritance.fruit;

public class Lemon extends Fruit{
	@Override
	void prepareJuice() {
		this.clean();
		
		System.out.println("squeeze,extract and add sugar,water");
	}
	

}
