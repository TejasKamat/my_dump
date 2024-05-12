/* public class Car {
	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println(year + " " + make + " " + year);
	}
}
*/

public class Car {
	private String objName;

	public Car(String str) {
		System.out.println("I am in parametric constructor");
		this.objName = str;
	}

	public void display() {
		System.out.println("I am in display of the car" + " " + objName);
	}

	/*public static void main(String args[]) {
		System.out.println("I am in main of car");
		Car c1 = new Car("object1");
		c1.display();

		Car c2 = new Car("object2");
		c2.display();
	}*/
}