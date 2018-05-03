package com.ashish.statickeyword;

public class StaticVariable {

	static String brand="Camlin";
	String color;
	StaticVariable(String color){
		this.color=color;
	}
	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable("Red");
		StaticVariable sv1 = new StaticVariable("Blue");
		StaticVariable sv2 = new StaticVariable(null);
		StaticVariable sv3 = new StaticVariable("purple");
		System.out.println(sv1);
		System.out.println(sv1.color);
		System.out.println(sv2);
		System.out.println(brand);
		String c= sv3.brand="Reynolds";  // accessible but not a good practice
		String c1= StaticVariable.brand;
		System.out.println(c);
		System.out.println(c1);
		
	}
}
