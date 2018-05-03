package com.ashish.generalization.vehicle;

import java.util.Random;

public class Toll {

	Vehicle collectMoney() {
//		Random r = new Random();
	//	int n = r.nextInt(3)+1;
		int opt = new Random().nextInt(3)+1;
		
		switch (opt) {
		case 1:
			return new Truck();
		case 2:
			return new Car();

		default:
			return new Bike();
		}
	}
	public static void main(String[] args) {
		Toll t = new Toll();
		Vehicle v = new Vehicle();
		System.out.println(v);
		System.out.println(t);
		Vehicle v1 = t.collectMoney();
		System.out.println(v1);
	}
}
