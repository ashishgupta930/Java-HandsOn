package ashish.india.laptop;

import java.util.Scanner;

public class Employee {

	String name;
	int age;
	String department;
	String address;
	double salary;
	String empId;
	
	void show() {
		System.out.println(this.name+" "+age+" "+department+" "+address+" "+salary+" "+empId);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		e.name=sc.next();
		System.out.println("Enter age");
		e.age=sc.nextInt();
		System.out.println("Enter department");
		e.department=sc.next();
		sc.nextLine();
		System.out.println("Enter address");
		e.address=sc.nextLine();
		System.out.println("Enter salary");
		e.salary=sc.nextDouble();
		System.out.println("Enter empId");
		e.empId=sc.next();
		e.show();
		
	}
}
