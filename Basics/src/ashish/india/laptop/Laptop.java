package ashish.india.laptop;

public class Laptop {

	int price;
	double screensize;
	String brand;
	String color;
	int hddCapacity;
	
	void details() {
		System.out.println(this.price+" "+this.brand+" "+this.color+" "+this.screensize+" "+this.hddCapacity);
	}
	public Laptop(int price) {//parameter
		this.price = price;
		this.brand= "Dell";
		this.color = "Blue";
		this.screensize=14.5;
		this.hddCapacity= 500;
		this.details();
	}
	
	public Laptop(double screensize, String brand) {
		this.screensize = screensize;
		this.brand = brand;
		this.color="Black";
		this.price=35000;
		this.hddCapacity=2000;
		this.details();
	}
	
	public Laptop(String color) {
		this(1000,13.2,"wipro","pink",100);//constructor calling inside the constructor
		this.color = color;
		this.brand="HP";
		this.screensize=13.5;
		this.price=34000;
		this.hddCapacity=250;
		this.details();
		
	}
	
	public Laptop(int price, double screensize, String brand, String color, int hDDCapacity) {
		this.price = price;
		this.screensize = screensize;
		this.brand = brand;
		this.color = color;
		this.hddCapacity = hDDCapacity;
		this.details();
	}
	public static void main(String[] args) {
		Laptop l1 = new Laptop(15000);//arguments
		System.out.println(l1.brand);
		Laptop l2 = new Laptop(15, "Apple");
		Laptop l3 = new Laptop("Blue");
		Laptop l4 = new Laptop(100000, 17, "Lenovo", "Red", 1000);
	}
}
  
