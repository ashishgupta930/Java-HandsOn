package com.seed.overridingexample;

public class TestSeed {

	public static void main(String[] args) {

		Seed s = new CoffeeBean();// ,null,new MangoSeed(),new Seed()
		s.grow();
		if (s instanceof CoffeeBean) {
			CoffeeBean cs = (CoffeeBean) s;
			cs.prepareCoffee();

		}
		}
	}


