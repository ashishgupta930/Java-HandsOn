package org.ashish.variable;

public class Fan {

	String color;
	String brand = "Cello";
	int noOfBlades = 3;
	int price = 500;

	void blowAir() {
		System.out.println("Blowing Air");
	}

	void showDetails() {
		System.out.println(color + " " + noOfBlades + " " + price);
		System.out.println(this.color + " " + this.noOfBlades + " " + this.price);
	}

	public static void main(String[] args) {

		Fan f1 = new Fan();
		Fan f2 = new Fan();
		System.out.println(f1.color);
		f1.color = "Red";
		f2.color = "black";
		System.out.println(f1.color);
		System.out.println(f2.color);
		System.out.println(f1.brand);
		f1.price = 400;
		System.out.println(f1.price);
		System.out.println(f2.price);
		f1.showDetails();
	}

}
