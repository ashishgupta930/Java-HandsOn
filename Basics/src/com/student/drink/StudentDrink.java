package com.student.drink;

public class StudentDrink {

	public static void main(String[] args) {
		Student s = new Student();
		Juice j = new Juice();
		Coffee c = new Coffee();
		s.drink(c);
		s.drink(j);
	}
}
