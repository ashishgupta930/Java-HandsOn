package com.uielement.overridingexample;

public class Button extends UIElement {

	public Button() {
		super("Button", "Submit");
	}

	@Override
	void action() {
		System.out.println("Click to Activate");
	}
	 void show() {
		 System.out.println("Display Button");
	}
}
