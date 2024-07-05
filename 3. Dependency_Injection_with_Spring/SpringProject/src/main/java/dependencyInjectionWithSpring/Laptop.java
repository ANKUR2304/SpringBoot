package dependencyInjectionWithSpring;

public class Laptop {
	Computer computer;
	
	public Laptop() {
		System.out.println("Laptop Object created!");
	}
	
	public Computer getComputer() {
		return this.computer;
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void display() {
		computer.display();
		System.out.println("Inside display() method of Laptop!");
	}
}
