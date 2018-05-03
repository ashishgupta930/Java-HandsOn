package com.bottle;

public class BottleFill {

	public static void main(String[] args) {
		Bottle b = new Bottle();
		Water w = new Water();
		Juice j = new Juice();
		Oil o = new Oil();
		
		b.store(w);
		b.store(j);
		b.store(o);
	}
}
