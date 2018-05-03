package com.ashish.inheritance.casting;

import java.util.Scanner;

public class Zoo {

	Animal sell() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an animal name");
		String name = sc.next();
		if(name.equalsIgnoreCase("Cow")) {
			return new Cow("White","Herbivorous");
		}
		else if(name.equalsIgnoreCase("Cat")) {
			return new Cat("Brown","Domestic");
		}
		else if (name.equalsIgnoreCase("Lion")) {
			return new Lion("Black","Carnivorous");
		}else
			return null;
	}
}
