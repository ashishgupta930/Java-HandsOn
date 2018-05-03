package com.ashish.inheritance;

import java.util.Random;

public class Lamp {
	void lamp() {

	}

	Object heatup() {
		Random r = new Random();
		int n = r.nextInt(5) + 1;
		switch (n) {
		case 1:
			return new Genie();
		case 2:
			return new Mini();
		default:
			return null;
		}

	}
}
