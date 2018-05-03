package com.uielement.overridingexample;

public class UIElement {

	String type;
	String name;
	
	void action() {
		System.out.println("Select to Activate");
	}

	public UIElement(String type, String name) {
		this.type = type;
		this.name = name;
	}
}
