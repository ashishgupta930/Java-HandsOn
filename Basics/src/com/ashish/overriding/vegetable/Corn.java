package com.ashish.overriding.vegetable;

public class Corn extends Vegetable {

      Corn() {
		super("yellow","Sweet");
	}
      void prepareSoup() {
    	  System.out.println("Soup");
      }
      @Override
    void clean() {
System.out.println("Clean corn");
      }

}
