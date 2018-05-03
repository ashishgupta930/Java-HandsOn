package ashish.india.laptop;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter Name");
	//	String s = sc.next();// one word String
		String name = sc.nextLine();// multi word String
	//	System.out.println(s);
	//	System.out.println(name);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your salary");
		double salary= sc.nextDouble();
		System.out.println(name+" "+age+" "+salary);*/
		
		System.out.println("Enter name");
		String name1 = sc.next();
		sc.nextLine();// dummy nextLine method because  before nextLine one next() is present ,so to avoid enter we use this dummy nextLine.
		System.out.println("Enter Address");
		String Address = sc.nextLine();
		System.out.println("Enter Company Name");
		String Company = sc.nextLine();
		System.out.println(name1+" "+Address+" "+Company);
	}
}
