package com.puma.shoeproject;

public class Shoe {
	String color;
	String material;
	int size;
	String brand ="Puma";
	public Shoe(int size) {
		this.size = size;
		this.color = "Black";
		this.material="Leather";
		this.show();
	}
	 public Shoe(String color, int size) {
		this.color = color;
		this.size = size;
		this.material="Polymer";
		this.show();
	}
	public Shoe(String color, String material, int size) {
		this.color = color;
		this.material = material;
		this.size = size;
		this.show();
	}
	void show() {
		 System.out.println(this.size+" "+this.color+" "+this.material);
	}
	 public static void main(String[] args) {
		Shoe s = new Shoe(7);
		Shoe s1 = new Shoe("Red", 6);
		new Shoe("pink", "Rubber", 8);
	}
	 
}
