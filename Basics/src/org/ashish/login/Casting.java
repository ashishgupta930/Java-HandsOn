package org.ashish.login;

public class Casting {

	public static void main(String[] args) {
		byte b = 124;
		short s = b;
		System.out.println(s);
		byte b1 = (byte)s;
		System.out.println(b1);
		
		int i =255;
		byte b2= (byte)i;
		System.out.println(b2);// data loss
		
		long l = 135;
		byte b3 = (byte)l;
		System.out.println(b3);
		
		byte b4 =10;
		b4= (byte)(b4+20);
		System.out.println(b4);
		
		float f = 54.54f;
		double d1 = 3.4;
		System.out.println(f);
		
		Casting c = new Casting();
		c.show('A');
		c.show('a');
	//c.show(123l);            error if you put double instead of int in show method it will work because it search to promoted the value
		byte b5 = 5;
		c.show(b5);
		c.show(4.3);
		c.show(2.3f);
		c.show(4.45f );
		System.out.println(c);
		
	}
	void show(int x) {
		System.out.println("int "+x);
	}
	void show (double x) {
		System.out.println("double "+x);
	}
	void show (float x) {
		System.out.println("float "+x);
	}
	void show(short x) {
		System.out.println("short "+x);
	}
}
