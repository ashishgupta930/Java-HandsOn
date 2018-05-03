package com.ashish.all;

public class Constructor {

	int id;
	String name;
	Constructor(int id,String name){
		this.id= id;
		this.name=name;
		System.out.println(this.id+" "+this.name);
	}
	Constructor(){
		this.id = 100;
		this.name = "Dummy";
		System.out.println(this.id +" "+name);
	}
	public static void main(String[] args) {

		Constructor c = new Constructor(23,"Ramesh");
		Constructor c1 = new Constructor();
		
	}

}
