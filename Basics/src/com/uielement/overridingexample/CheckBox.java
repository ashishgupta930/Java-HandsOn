package com.uielement.overridingexample;

public class CheckBox extends UIElement {

	public CheckBox() {
		super("Transparent", "CheckName");
	}

	@Override
	void action() {
		System.out.println("Check to Activate"); // logic change in overriding
	}

}
