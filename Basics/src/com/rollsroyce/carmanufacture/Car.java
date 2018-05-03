package com.rollsroyce.carmanufacture;

public class Car {
	String color;
	String model;
	String brand="Rolls Royce";
	String varient;

	Car(String color){
		this.color=color;
		this.model="Ghost";
		this.varient="Petrol";
		//System.out.println(color+" "+model+" "+varient);
		this.show();
		
	}
	Car(String color,String model){
		this.color=color;
		this.model=model;
		this.varient= "Diesel";
	//	System.out.println(color+" "+model+" "+varient);
		show();
		
	}
	Car(String color,String model,String varient){
		this.color=color;
		this.model=model;
		this.varient=varient;
	//	System.out.println(color+" "+model+" "+varient);
		show();
	}
	void show() {
		System.out.println(this.color+" "+this.model+" "+varient+" "+this.brand);
	}
	public static void main(String[] args) {
		
		Car c = new Car("Green");
		Car c1 =new Car("Red","Phantom");
		Car c2 = new Car("Black", "Wrath", "Gas");
		
		System.out.println(c.color);
	}
}
