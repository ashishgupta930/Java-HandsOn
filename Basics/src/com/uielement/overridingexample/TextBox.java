package com.uielement.overridingexample;

public class TextBox extends UIElement {

	public TextBox() {
		super("TextBox", "Name");
	}

	@Override
	void action() {
		System.out.println("Enter the Text");
	}

}
