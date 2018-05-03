package com.ashish.all;

public class Gold {
	double quantity;  //instance variable
	double price;
	
	Gold(double quantity){//local vairable quantity
		this.quantity=quantity;
	this.price= quantity*2935.65;
	details();
	}
void details() {
	System.out.println(this.quantity +" "+ this.price);
}

	public static void main(String[] args) {
		Gold g = new Gold(45);
		

	}

}
