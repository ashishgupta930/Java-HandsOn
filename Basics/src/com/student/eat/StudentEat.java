package com.student.eat;

public class StudentEat {

	public static void main(String[] args) {
		Student s = new Student();
		Chocolate c = new Chocolate();
		Roti r = new Roti();
		Pizza p = new Pizza();
		s.eat(c);
		s.eat(p);
		s.eat(r);
		
		
	}
}
