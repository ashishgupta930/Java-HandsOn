package org.ashish.calcapp;

public class Calculator {
	
	int add(int a,int b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	int add(int a,int b,int c) {
		int result = a+b+c;
		System.out.println(result);
		return result;
	}
	float add(float a,float b) {
		
		float result= a+b;
		System.out.println(result); 
		return result;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(4, 25);
		c.add(1, 2, 3);
		c.add(45.6f,72.4f);
		
		
	}
	
	
}
