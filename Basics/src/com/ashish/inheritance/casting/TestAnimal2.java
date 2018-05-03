package com.ashish.inheritance.casting;

public class TestAnimal2 {
	public static void main(String[] args) {
		Zoo z= new Zoo();
		Animal a = z.sell();// upcasting because the method will return either cat,lion,cow object
		System.out.println(a);
		if(a!=null) {
		a.eat();
	}else {
		System.out.println("No animal to eat");
	}
	}
}
