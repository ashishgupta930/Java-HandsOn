package com.uielement.overridingexample;

public class Person {

	void browse() {
		Browser b = new Browser();
		UIElement u =b.getElement("www.google.com");
		System.out.println(u);
		u.action();
		if(u instanceof Button) {  // boolean value by instanceof
		Button bu = (Button)u;
		bu.show();
		}
		
	}
	public static void main(String[] args) {
		
		Person p = new Person();
		p.browse();
	}
}
