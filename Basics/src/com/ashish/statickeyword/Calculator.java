package com.ashish.statickeyword;

public class Calculator {

	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}

class Laptop {
	void add(int a, int b) {
		Calculator.add(a, b);
	}
}

class Mobile {
	void add(int a, int b) {
		Calculator.add(a, b);
	}
}

class Test {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.add(20, 25);
		// System.out.println(Calculator.add(20, 20));
	}
}
