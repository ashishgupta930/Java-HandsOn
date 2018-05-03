package com.nonprimitivedatatype.food;

public class TestPerson {
	
public static void main(String[] args) {
		
		Person p = new Person();
		Food x = new Food();
		Food f = new Food();
		p.eat(x);
		p.eat(f);
		p.eat(new Food());
	}

}
