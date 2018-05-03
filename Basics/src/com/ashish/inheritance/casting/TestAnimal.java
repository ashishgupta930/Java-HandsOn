package com.ashish.inheritance.casting;



public class TestAnimal  {
	public static void main(String[] args) {
		Cow c = new Cow("Black","Domestic");
		System.out.println(c);
		Animal a = c;
		
		System.out.println(a);
		c.giveMilk();
	//	a.giveMilk();  //can not access because it is sub class specific method
		Object o = a;
		Animal a2 =c;
		
		
		
		
		
		Animal a1 = (Animal)o;
		
		Cow c1 = (Cow)a;
		Goat g = new Goat();
	//	Animal a3 = g;
		//Goat g1 = (Goat)a;
		
		
		
		
		
		
		
	}

}
