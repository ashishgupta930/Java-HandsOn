package com.ashish.inheritance.casting;

import java.util.Scanner;

public class Museum {

	Object auction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		if(name.equalsIgnoreCase("coin")) {
			return new Coin();
		}
		else if (name.equalsIgnoreCase("Car")) {
			return new Car();
			
		}
		else if (name.equalsIgnoreCase("Sword")) {
			return new Sword();
		}
		else
			return null;
			
	}
}
