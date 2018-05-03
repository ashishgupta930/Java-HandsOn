package com.ringoverriding;

import java.util.Random;
import java.util.Scanner;

public class Shop {

	Jewel sell() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the jewel name");
		String jewelName= sc.next();
		sc.close();
		//int n = new Random().nextInt(4)+1;
		if(jewelName.equalsIgnoreCase("bracelet")) 
			return new Bracelet();
		
		
		else if(jewelName.equalsIgnoreCase("ring"))
			return new Ring();
		
		else if(jewelName.equalsIgnoreCase("chain"))
		return new Chain();
		
		else 
			return null;
			
		
		
	}
}
