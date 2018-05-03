package com.ashish.overriding.vegetable;

public class TestVeg {

	public static void main(String[] args) {
		Potato p = new Potato();
		p.clean();
		p.prepareChips();
		System.out.println(p.color+p.type);
	
		
	}
}
